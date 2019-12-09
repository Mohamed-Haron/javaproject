
package project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class lectures extends JFrame {
    
   // AddLecture lecture ;
    JLabel CourseName , CourseCode ;
    JTextField CN , CCode ;
    JButton Add , UPdate , Delete ;
    
      ArrayList<domain.students> arr = database.student_database.get_students();
    JTable table ;
    JScrollPane sc ;
    String data[][];
    String header[] = {"id","name" , "GBA" , "department"};
    
    
    public lectures(){
        
    }
    public void view_lectures(){
        
        //lecture = new AddLecture();
       
         this.setTitle("Lectures");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
         this.setResizable(false);
         this.setLayout(null);
         // belongs to the side of table
         //table code
          data = new String[arr.size()][4];
        for (int input = 0 ; input < arr.size() ; input ++){
            data[input][0] = ""+arr.get(input).getId();
            data[input][1] = arr.get(input).getName();
            data[input][2] = ""+arr.get(input).getGba();
            data[input][3]= arr.get(input).getDepartment();
        } // end for
        table = new JTable(data,header);
        sc = new JScrollPane(table);
        sc.setBounds(0, 0, 300, 300);
        add(sc);
         
          // belongs to buttons and labels
          CourseName = new JLabel("CourseName"); 
          CourseCode = new JLabel("CourseCode");
           Add = new JButton("Add");
            UPdate= new JButton("UPdate") ;
            Delete= new JButton("Delete") ;
          CN = new JTextField();
          CCode = new JTextField();
          CourseName.setBounds(400, 40, 120, 25);
          CN.setBounds(400, 80, 120, 30);
          CourseCode.setBounds(400, 150, 120, 25);
          CCode.setBounds(400, 190, 90, 25);
          Add.setBounds(400,350,80,30);
          UPdate.setBounds(400,300,80,30);
          Delete.setBounds(400,400,80,30);
          this.add(CourseName) ; this.add(CourseCode) ; this.add(CCode); this.add(CN) ;
          this.add(Add) ; this.add(UPdate) ; this.add(Delete) ;
          
          this.setVisible(true);
    }
}
