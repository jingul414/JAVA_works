package subject_c;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();                               //문제의 갯수
        String type;                                            //문제의 타입(e:주관식, m:객관식)
        TestQuestion[] questions = new TestQuestion[num];       //문제
        for (int i = 0; i < num; i++) {
            type = scan.next();
            if(type.equals("e")){
                System.out.println("e입력,test");
                questions[i] = new Essay();
            }else{
                System.out.println("m입력,test");
                questions[i] = new MultipleChoice();
            }
            questions[i].readQuestion();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(i + ". ");
            questions[i].printQuestion();
        }
        scan.close();
    }
}
