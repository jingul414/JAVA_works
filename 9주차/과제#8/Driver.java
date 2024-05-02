package subject8_2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력
        int num = 0; // 연산의 종류(1~5)
        String className; // 교과목 명
        String name; // 추가시, 학생의 이름
        int id; // 학생의 학번
        System.out.println("교과목명을 입력하세요: ");
        className = sc.next();
        ClassRoll cr = new ClassRoll(className);

        do {
            System.out.println("원하는 연산을 선택하세요.: ");
            System.out.println("(1) 추가\n(2) 삭제\n(3) 찾기\n(4) 출력\n(5) 종료");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    // 추가
                    System.out.print("추가하는 학생의 이름을 입력하세요: ");
                    name = sc.next();
                    System.out.print("추가하는 학생의 학번을 입력하세요: ");
                    id = sc.nextInt();
                    Student tmp = new Student(name, id);
                    cr.addStu(tmp);
                    break;
                case 2:
                    // 삭제
                    System.out.print("삭제하는 학생의 학번을 입력하세요: ");
                    id = sc.nextInt();
                    cr.delStu(id);
                    break;
                case 3:
                    // 찾기
                    System.out.print("찾는 학생의 학번을 입력하세요: ");
                    id = sc.nextInt();
                    cr.getStuName(id);
                    break;
                case 4:
                    // 출력
                    cr.printing();
                    break;
                case 5:
                    // 종료
                    break;
                default:
                    System.out.println("1~5의 숫자만 입력하세요");
                    break;
            }
            cr.printing();
        } while (num != 5);
        sc.close();
    }

}
