package subject9_1;

public class Driver {
    public static void main(String[] args) {
        LetterGradeCourse lgCourse = new LetterGradeCourse("자료구조", 95);
        PassFailCourse pfCourse = new PassFailCourse("교양세미나", 58);

        System.out.println("교과목명: " + lgCourse.printName() + ", 점수: " + lgCourse.printGrade() + ", 학점: " + lgCourse.getGrade());
        System.out.println("교과목명: " + pfCourse.printName() + ", 점수: " + pfCourse.printGrade() + ", 학점: " + pfCourse.getGrade());

    }
}
