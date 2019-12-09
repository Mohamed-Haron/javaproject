
package database;



import domain.courses;
import domain.students;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class courses_database {
    
    public static Connection connect() throws SQLException{
      
        return DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databasename=task;user=java;password=1234");
    
    }
         public static void insert_courses(String CourseName,int CourseCode){
        try{
            
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into courses values(?,?)");
            p.setString(1, CourseName);
            p.setInt(2, CourseCode);
            p.execute();
        }catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    }
          public static ArrayList<courses> get_courses(){
        
        ArrayList<courses> list = new ArrayList<>();
        
        try{
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select * from courses");
            ResultSet r = p.executeQuery();
            while (r.next()){
            list.add(new courses(r.getString("CourseName"),r.getInt("CourseCode")));
            }
           r.close();
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return list ;
    }
    }

