
package GUI;

/* class name  TA refer to Professor's students whose will apper in 
  professor dashboard
*/

import java.awt.*;
import javax.swing.*;

public class PT extends JFrame {
    JButton addstudent , deletestudent , updatestudent;
    public  void show_selection(){
       this.setTitle("students");
        this.setSize(800, 500);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        
        addstudent = new JButton("addstudent");
        deletestudent= new JButton("deletestudent");
         updatestudent= new JButton("updatestudent");
         
         // i will define bounds
         addstudent.setBounds(60, 60, 140, 30);
         deletestudent.setBounds(60, 150, 140, 30);
         updatestudent.setBounds(60,230,140,30);
         this.add(addstudent); 
         this.add(deletestudent);
         this.add(updatestudent);
         this.setVisible(true);
        
    }
    
}
