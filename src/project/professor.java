
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class professor extends JFrame implements ActionListener {
    JTabbedPane tab ; // like menu
    //add student; // object from add class
    //addcourse course ;
    coursestable ct ; // refer to  coursestable
    public professor(){ 
       
     
   }
     public void view_professor(){
         //student= new add(); // student is an object from class add
        // course = new addcourse();
         ct = new coursestable();
         this.setTitle("courses");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
        // this.setLayout(null);
         this.setResizable(false);
          tab=new JTabbedPane();
         //tab.addTab("Add students" , student); // "students" will apper in screen but second'student' refer to the object
         //tab.addTab("courses", course);
         tab.addTab("show courses" , ct);
         add(tab);
         setVisible(true);
         // adding the menu
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
    }
}

