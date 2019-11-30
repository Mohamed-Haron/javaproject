
package project;
import javax.swing.*;
import java.awt.*;
public class homescreen  extends JFrame {
    
    JLabel Username , password;
    JTextField username;
    JPasswordField pass ;
    JButton signin ;
     public homescreen(){
          // this data belong to the first screen properites
          
         this.setTitle("Learning System");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLocation(500,300);
         this.setLayout(null);
         this.setResizable(false);
             //defining of the components 
        Username= new JLabel("Username");
        password= new JLabel("password");
        signin = new JButton("Signin");
        username = new JTextField();
        pass= new JPasswordField();
        
        // properites of buttons 
        Username.setBounds(200, 100, 90, 80);
        password.setBounds(200, 180, 100, 80);
        username.setBounds(400,120,200,30);
        pass.setBounds(400,200,200,30);
        signin.setBounds(380, 300, 90, 30);
        
        // we use that to show buttons in frame
       this.add(Username);
       this.add(password);
       this.add(username);
       this.add(pass);
       this.add(signin);
       this.setVisible(true);
             
    
    }      
      
    
}
