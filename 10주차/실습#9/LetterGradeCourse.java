package subject9_1;

public class LetterGradeCourse extends Course {
    public LetterGradeCourse(String name, int grade) {
        super(name, grade);
    }

    public void setScore(){
        if(grade >= 80){
            score = "A";
        }else if(60 <= grade && grade < 80){
            score = "B";
        }else{
            score = "F";
        }
    }
}
