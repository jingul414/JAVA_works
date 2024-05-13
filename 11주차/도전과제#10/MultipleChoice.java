package subject_c;

import java.util.Scanner;

public class MultipleChoice extends TestQuestion{
    private int choiceCount;        //선택지의 개수
    private String[] choices;       //선택지

    @Override
    public void readQuestion() {
        Scanner sc = new Scanner(System.in);

        //선지 갯수 입력
        choiceCount = sc.nextInt();
        choices = new String[choiceCount];
        
        //버퍼 비우기
        sc.nextLine();

        //문제 입력
        question = sc.nextLine();

        //선지 입력
        for(int i = 0; i < choiceCount; i++) {
            choices[i] = sc.nextLine();
        }
    }

    @Override
    public void printQuestion() {
        super.printQuestion();
        for(int i = 0; i < choiceCount; i++) {
            System.out.println("  " + (char)('a' + i) + ". " + choices[i]);
        }
    }

}
