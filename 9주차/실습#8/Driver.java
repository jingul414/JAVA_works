package subject8_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String className;
        System.out.println("교과목명을 입력하세요: ");
        className = sc.next();
        ClassRoll cr = new ClassRoll(className);

        do {
            System.out.print("원하는 연산을 선택하세요.: ");
            System.out.println("(1) 추가  (2) 찾기  (3) 종료");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    String name;
                    String id;
                    System.out.print("추가하는 학생의 이름을 입력하세요: ");
                    name = sc.next();
                    System.out.print("추가하는 학생의 학번을 입력하세요: ");
                    id = sc.next();
                    Student tmp = new Student(id, name);
                    cr.addStu(tmp);
                    break;
                case 2:
                    String id_tmp;
                    System.out.print("찾는 학생의 학번을 입력하세요: ");
                    id_tmp = sc.next();
                    cr.getStuName(id_tmp);
                case 3:
                    break;
                default:
                    System.out.println("1~3의 숫자만 입력하세요");
                    break;
            }
        } while (num != 3);
        sc.close();
    }
    
}
