
package domain;


public class lecture {
    int prof_id,course_code,start_time , end_time ;
    String location ;

    public lecture(int prof_id, int course_code, int start_time, int end_time, String location) {
        this.prof_id = prof_id;
        this.course_code = course_code;
        this.start_time = start_time;
        this.end_time = end_time;
        this.location = location;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public int getCourse_code() {
        return course_code;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
