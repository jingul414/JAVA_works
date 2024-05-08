package subject9_1;

public class PassFailCourse extends Course {

    public PassFailCourse(String name, int grade) {
        super(name, grade);
    }

    public void setScore(){
        if(grade >= 60){
            score = "CR";
        }else {
            score = "NC";
        }
    }
}
