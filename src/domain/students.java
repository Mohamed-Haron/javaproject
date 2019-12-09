
package domain;


public class students {
    private int id ;
     private String name;
    private Float gba ;
    private String department;

    public students(int id, String name, Float gba, String department) {
        this.id = id;
        this.name = name;
        this.gba = gba;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGba() {
        return gba;
    }

    public void setGba(Float gba) {
        this.gba = gba;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   
}
