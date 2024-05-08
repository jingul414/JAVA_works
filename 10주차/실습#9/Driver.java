package subject9_1;

public class Driver {
    public static void main(String[] args) {
        LetterGradeCourse lgCourse = new LetterGradeCourse("자료구조", 95);
        lgCourse.setScore();
        System.out.println("교과목명: " + lgCourse.getName() + ", 점수: " + lgCourse.getGrade() + ", 학점: " + lgCourse.getScore());

        PassFailCourse pfCourse = new PassFailCourse("교양세미나", 58);
        pfCourse.setScore();
        System.out.println("교과목명: " + pfCourse.getName() + ", 점수: " + pfCourse.getGrade() + ", 학점: " + pfCourse.getScore());
    }
}
