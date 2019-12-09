
package domain;


public class courses  {
    
    private String coursename ;
    int coursecode ;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(int coursecode) {
        this.coursecode = coursecode;
    }

    public courses(String coursename, int coursecode) {
        this.coursename = coursename;
        this.coursecode = coursecode;
    }
    
}
