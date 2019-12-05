
package database;

import java.sql.*;
import domain.user;
import java.util.ArrayList;
public  class connection {
    public static Connection connect() throws SQLException{
      
        return DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databasename=task;user=java;password=1234");
    
    }
    
    public static ArrayList <user> get_users(){
        
        ArrayList<user> list = new ArrayList<user>();
        try{
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement("select * from users");
        
        ResultSet rs  = ps.executeQuery();
        
         while (rs.next()){
             list.add(new user (rs.getString("user_name"),rs.getString("password")));
             
         }
          
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } // end catch
        return list ;
    }
    
    public static int check_user(String user , String pass){
        
        ArrayList<user> arr= get_users();
        int x = 0;
        for (int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i).getUsername().equalsIgnoreCase(user)){
                if (arr.get(i).getPassword().equalsIgnoreCase(pass)){
                    x= 1 ; // user name is correct
                    break ; // if username corret exit for loop 
                }
                else{
                    x = 2 ; /* password incorrect*/ // exit for loop
                    break ;
                } // end else
                
            } // end first if statement
            else {
                 x = 0 ;
            } // that belongs to first if that it check both user and pass
           
        }// end for loop
         return x ;
    }

   

    
}
