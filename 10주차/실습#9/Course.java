package subject9_1;

public class Course {
    protected String name;
    protected int grade;
    protected String score = null;

    public Course(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }
    
    public String getScore(){
        return score;
    }

    
}