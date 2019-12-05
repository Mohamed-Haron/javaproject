
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class professor extends JFrame implements ActionListener {
    JMenu students ;
    JMenu courses ;
    JMenu TAs;
    JMenuBar MB ;
   
    public professor(){ 
       
     
   }
     public void view_sec(){
         
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

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==students){
           this.dispose();
         new PT().show_selection();
       }
    }
}

