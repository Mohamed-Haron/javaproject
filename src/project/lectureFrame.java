
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
// it requrued two pannels 1 to table and second to adding
public class lectureFrame extends JFrame implements ActionListener {
    JLabel prof_num , course_num ,start , end , location; 
    JTextField profnum , coursenum ,Start , End , Location;
    JButton submit ;
    JTable tabel1 ;
    JScrollPane ss ;
    String data[][];
    String header[] = {"prof_num","course_num","start","end","location"};
    ArrayList<domain.lecture> arr = database.lecture_database.get_lectures();
   public lectureFrame(){
       
   }
   
   public void show_lectureFrame(){
       
        this.setTitle("Lectures");
         this.setSize(800,500);  
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setLayout(null);
         this.setResizable(false);
         
         // labels  and  textfields
         prof_num = new JLabel("prof_num");
         course_num = new JLabel("course_num");
         start = new JLabel("start");
         end = new JLabel("end");
         location = new JLabel("location");
         submit = new JButton("submit");
         submit.addActionListener(this);
         this.add( prof_num ); this.add(start); this.add(course_num); this.add(end);this.add(location);
         this.add(submit);
         
         
          profnum = new JTextField();
          coursenum =  new JTextField();
           Start = new JTextField();
           End = new JTextField();
           Location = new JTextField();
           this.add(profnum); this.add(coursenum); this.add(Start); this.add(End);this.add(Location);
           
           prof_num.setBounds(20, 20, 70, 25);
           profnum.setBounds(130, 20, 50, 25);
           
           course_num.setBounds(20, 50, 90, 25);
           coursenum.setBounds(130, 50, 50, 25);
           
           start.setBounds(20, 80, 30, 25);
           Start.setBounds(130, 80, 50, 25);
           
           end.setBounds(20, 120, 30, 25);
           End.setBounds(130, 120, 50, 25);
           
           location.setBounds(20, 160, 80, 25);
           Location.setBounds(100, 160, 80, 25);
           
           submit.setBounds(50, 250, 90, 30);
           
           // table 
           
           data = new String[arr.size()][5];
           for (int i =0 ; i < arr.size() ; i++){
               data[i][0] = "" +arr.get(i).getProf_id();
               data[i][1]= ""+ arr.get(i).getCourse_code();
               data[i][2]= ""+ arr.get(i).getStart_time();
               data[i][3]=""+ arr.get(i).getEnd_time();
               data[i][4]= arr.get(i).getLocation();
           }
           tabel1 =new JTable(data,header);
           ss= new JScrollPane(tabel1);
           ss.setBounds(300, 0, 400, 300);
           add(ss);
         this.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit){
            database.lecture_database.insert_lecture(Integer.parseInt(profnum.getText()), Integer.parseInt(coursenum.getText()), Integer.parseInt(Start.getText()), Integer.parseInt(End.getText()), Location.getText());
        }
    }
   
}
