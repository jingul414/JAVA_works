package subject_c;

public class Driver {
    public static void main(String[] args) {
        final int MAX_SIZE = 5;
        Course[] courses = new Course[MAX_SIZE];
        courses[0] = new Major("자바", "CS101", "컴퓨터공학", "C");
        courses[1] = new Major("이산 수학", "CS215", "컴퓨터공학", "없음");
        courses[2] = new GenEdu("물리학", "PHS210", "학문기초교양");
        courses[3] = new GenEdu("영어 1", "ENG101", "공통교양");
        courses[4] = new Elective("테니스", "REC310");
        for(int i = 0; i < MAX_SIZE; i++){
            courses[i].printInfo();
            System.out.println("");
        }
    }

}
