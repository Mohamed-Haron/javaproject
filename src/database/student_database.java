
package database;

import java.sql.*;
import java.util.ArrayList;
import domain.students;
public class student_database {
    
    public static Connection connect() throws SQLException{
      
        return DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databasename=task;user=java;password=1234");
    
    }
    public static void insert_student(int id,String name , float GBA , String department){
        try{
            
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into students(id,name,GBA,department) values(?,?,?,?)");
            p.setInt(1, id);
            p.setString(2, name);
            p.setFloat(3, GBA);
            p.setString(4, department);
            p.execute();
        }catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList<students> get_students(){
        
        ArrayList<students> list = new ArrayList<>();
        
        try{
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select * from students");
            ResultSet r = p.executeQuery();
            while (r.next()){
            list.add(new students(r.getInt("id"),r.getString("name"),r.getFloat("GBA"),r.getString("department")));
            }
       
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return list ;
    }
}
