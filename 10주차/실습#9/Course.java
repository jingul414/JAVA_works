package subject9_1;

public class Course {
    protected String name;
    protected int grade;

    public Course(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String printName() {
        return this.name;
    }

    public int printGrade() {
        return this.grade;
    }
    
    public String getGrade(){
        return null;
    }

    
}