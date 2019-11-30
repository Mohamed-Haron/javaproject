/* we use key word statement to perform action
   like
*/
package project;

import java.sql.*;
import GUI.professor ;
public class Project {

   
    public static void main(String[] args) {
        
        /*Now we will make a connection with sql server */
        Statement st;
        String query;
        String connectionURL = "jdbc:sqlserver://localhost:1433;databasename=task;user=java;password=1234";
        try{
       Connection co = DriverManager.getConnection(connectionURL);
      // st = co.createStatement();
//       query = "insert into students "
//               + "values(1,'mohamed',3.3,'general')";

         System.out.println("connected successfully......");
         //st.execute(query);
       
       }catch(SQLException e){
          System.out.println(e.getMessage());
       }// end catsh statement
        
        /* adding home screen */
        
        homescreen FS = new homescreen();
        
        professor pf = new professor();
       
    }
    
}
