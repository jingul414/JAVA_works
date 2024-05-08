package subject9_1;

public class LetterGradeCourse extends Course {
    public LetterGradeCourse(String name, int grade) {
        super(name, grade);
    }

    @Override
    public String getGrade(){
        if(grade >= 80){
            return "A";
        }else if(60 <= grade && grade < 80){
            return "B";
        }else{
            return "F";
        }
    }
}
