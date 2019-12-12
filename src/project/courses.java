
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class courses extends JFrame implements ActionListener{
  
     JLabel CourseName , CourseCode ;
    JTextField CN , CC ;
    JButton submit;
    JTable tabel ;
    JScrollPane ss ;
    String data[][];
    String header[]={"Course name" , "Course Code"};
    ArrayList<domain.courses>arr = database.courses_database.get_courses();
      public courses(){
        
    }
    public void show_courses(){
        
         this.setTitle("courses");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setLayout(null);
         this.setResizable(false);
         // belongs to labels and text fields 
          CourseName = new JLabel("CourseName");
        CourseCode = new JLabel("CourseCode");
        submit = new JButton("submit");
        CN = new JTextField();
        CC = new JTextField();
        
        CourseName.setBounds(50, 50, 90, 25);
         CN.setBounds(200, 50, 90, 25);
        CourseCode.setBounds(50, 90, 90, 25);
        CC.setBounds(200, 90, 50, 25); 
        submit.setBounds(150, 200, 90, 25);
       submit.addActionListener(this);
        this.add(CN); this.add(CC);  this.add(CourseName); this.add(CourseCode);this.add(submit);
        // this part belongs to table
        
        data= new String[arr.size()][2];
        
         for (int i = 0 ; i < arr.size() ; i++){
             
             data[i][0] = arr.get(i).getCoursename();
             data[i][1]=""+arr.get(i).getCoursecode();
         }
         
         tabel = new JTable(data,header);
         ss = new JScrollPane(tabel);
          ss.setBounds(300, 0, 400, 300);
           add(ss);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit){
            
            database.courses_database.insert_courses(CN.getText(), Integer.parseInt(CC.getText()));
        }
    }
}
