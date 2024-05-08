package subject9_1;

public class PassFailCourse extends Course {

    public PassFailCourse(String name, int grade) {
        super(name, grade);
    }

    @Override
    public String getGrade(){
        if(grade >= 60){
            return "CR";
        }else{
            return "NC";
        }
    }
}
