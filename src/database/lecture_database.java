
package database;

import static database.student_database.connect;
import domain.lecture;
import java.sql.*;
import java.util.ArrayList;
public class lecture_database {
    
     public static Connection connect() throws SQLException{
      
        return DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databasename=task;user=java;password=1234");
    
    }
     public static void insert_lecture(int prof_num,int c_code,int starttime ,int endtime, String location){
         try{
              Connection con = connect();
              PreparedStatement p = con.prepareStatement("insert into lectures values (?,?,?,?,?)");
              p.setInt(1, prof_num);
              p.setInt(2,c_code );
              p.setInt(3,starttime );
              p.setInt(4,endtime );
              p.setString(5,location );
              p.execute();
              
              
         }catch (SQLException e){
             System.out.println(e.getMessage());
         }
        
         
     }
     public static ArrayList <lecture> get_lectures(){
         ArrayList<lecture> list = new ArrayList<>();
         try{
             Connection con = connect();
            PreparedStatement p = con.prepareStatement("select * from lectures");
            ResultSet r = p.executeQuery();
            while(r.next()){
                list.add(new lecture(r.getInt("prof_num"),r.getInt("c_code"),r.getInt("starttime"),r.getInt("endtime"),r.getString("location")));
            }
            
            
         }catch(SQLException e){
             System.out.println(e.getMessage());
         }
        return list ;  
     }
}

