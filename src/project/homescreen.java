
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import database.connection;
public class homescreen  extends JFrame implements ActionListener {
    
    JLabel Username , password;
    JTextField username;
    JPasswordField pass ;
    JButton signin ,lecture ,courses;
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
        lecture = new JButton("Lecture");
        courses = new JButton("courses");
        username = new JTextField();
        pass= new JPasswordField();
        
        // properites of buttons 
        Username.setBounds(200, 100, 90, 80);
        password.setBounds(200, 180, 100, 80);
        username.setBounds(400,120,200,30);
        pass.setBounds(400,200,200,30);
        signin.setBounds(380, 300, 90, 30);
        lecture.setBounds(550, 300, 120, 30);
        courses.setBounds(100, 300, 120, 30);
        signin.addActionListener(this);
        lecture.addActionListener(this);
        courses.addActionListener(this);
        // we use that to show buttons in frame
       this.add(Username); // refer to label name
       this.add(password); // refer to label name
       this.add(username); // refer to text field
       this.add(pass); // belong to text field
       this.add(signin);
       this.add(lecture); this.add(courses);
       this.setVisible(true);
             
    
    }      

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== signin){
         int i=  database.connection.check_user(username.getText(),pass.getText());
         
         if (i == 1 ){
             this.dispose();
        new professor().view_professor();
         }
         else if(i== 2)
             JOptionPane.showMessageDialog(null, "please check your password" , "password error",JOptionPane.WARNING_MESSAGE);
            // System.out.println("password is not correct ..! please try again");
         if (i==0)
             JOptionPane.showMessageDialog(null, "user not found" , "error",JOptionPane.WARNING_MESSAGE);
             //System.out.println("user not found");
       
    
        
        }
       if (ae.getSource() == lecture){
           new lectureFrame().show_lectureFrame();}
       
       if (ae.getSource() == courses){
           new courses().show_courses();
       }
    }
      
    
}
