
package project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class coursestable extends JPanel {
      
    JTable table ;
    JScrollPane sc ;
    String data[][];
    String header[] = {"coursename","coursecode" };
    ArrayList<domain.courses> arr = database.courses_database.get_courses();
    public void coursestable(){
       this. setLayout(null);
        data = new String[arr.size()][2];
        for (int input = 0 ; input < arr.size() ; input ++){
            data[input][0] = arr.get(input).getCoursename();
             data[input][1] = ""+arr.get(input).getCoursecode();
            
           
        } // end for
        table = new JTable(data,header);
        sc = new JScrollPane(table);
        sc.setBounds(0, 0, 300, 300);
        this.add(sc);
    
    }
    
    
    public void showtable(){
           
    }
    
}
