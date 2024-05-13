package subject_c;

import java.util.Scanner;

public class Essay extends TestQuestion{
    private int answerLines;        //주관식 문제에 대한 답을 쓸 공간의 줄 수
    
    @Override
    public void readQuestion() {
        Scanner sc = new Scanner(System.in);

        //주관식 줄수 입력
        answerLines = sc.nextInt();

        //버퍼 비우기
        sc.nextLine();  

        //문제 입력
        question = sc.nextLine();   
    }

    
}
