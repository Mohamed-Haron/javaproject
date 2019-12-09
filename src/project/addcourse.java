
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addcourse extends JPanel implements ActionListener {
    JLabel CourseName , CourseCode , CourseHours;
    JTextField CN , CC, CH;
    JButton submit;
    public addcourse(){
        this.setLayout(null);
        CourseName = new JLabel("CourseName");
        CourseCode = new JLabel("CourseCode");
        //CourseHours = new JLabel("CourseHours");
        
        CourseName.setBounds(50, 50, 90, 25);
        CourseCode.setBounds(50, 90, 90, 25);
        //CourseHours.setBounds(50, 130, 90, 25);
        this.add(CourseName); this.add(CourseCode);// this.add(CourseHours);
        
        
        CN = new JTextField();
        CC = new JTextField();
       // CH = new JTextField();
        
        CN.setBounds(200, 50, 90, 25);
        CC.setBounds(200, 90, 50, 25);
        //CH.setBounds(200, 130, 30, 25);
        this.add(CN); this.add(CC); //this.add(CH);
        
        
        submit = new JButton("submit");
     submit.setBounds(150, 200, 90, 25);
     this.add(submit);
     submit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit){
            
            database.courses_database.insert_courses(CN.getText(), Integer.parseInt(CC.getText()));
        }
    }
}
