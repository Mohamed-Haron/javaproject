
package GUI;
import javax.swing.*;
import java.awt.*;

public class professor extends JFrame {
    JMenu students ;
    JMenu courses ;
    JMenu TAs;
    JMenuBar MB ;
   
    public professor(){ 
       
      this.setTitle("professor");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
         this.setLayout(null);
         this.setResizable(false);
         
         // adding the menu
          students = new JMenu("students");
         courses = new JMenu("courses");
         TAs = new JMenu("TAs");
         MB = new JMenuBar();
         MB.setBounds(0, 0, 800, 30);
         MB.setBackground(Color.LIGHT_GRAY);
         MB.add(students);MB.add(courses);MB.add(TAs);
         this.add(MB);
         
         
         
         this.setVisible(true);
   }
     public void view_sec(){
         
        
    }
}

