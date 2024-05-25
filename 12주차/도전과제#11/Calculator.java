package subject_c;

import java.util.Scanner;

public class Calculator {
    private double result; // 결과값
    private String op; // 연산자, 파라메터에서 op로 받음
    private double oprd; // 연산될 숫자, 파라메터에서 oprd2로 받음
    private String input; // 입력값(연산자 숫자)

    private Scanner sc = new Scanner(System.in);

    public Calculator() {
        this.result = 0.0;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getInput(){
        return this.input;
    }

    // 입력을 받고 결과를 설정하는 메소드
    public void inputData() throws UnknownOpException, DivideByZeroException {

        System.out.println("result = " + result);

        System.out.print("입력: ");
        input = sc.nextLine();

        if (input.equals("e") || input.equals("E")) {
            System.out.println("최종 result = " + getResult());
            System.out.println("계산기 프로그램이 종료됩니다.");
            return;
        }

        op = input.substring(0, 1);                     //연산자 추출
        oprd = Double.parseDouble(input.substring(2));  //숫자를 추출

        setResult(calc(result, op, oprd));
        System.out.println("갱신된 result = " + getResult() + "\n");
    }

    // 연산을 하는 메소드
    public double calc(double oprd1, String op, double oprd2) throws UnknownOpException, DivideByZeroException {
        // 연산자(op) 가 +, -, *, / 인지 확인
        if (!(op.equals("+")) && !(op.equals("-")) && !(op.equals("*")) && !(op.equals("/"))) {
            throw new UnknownOpException(op.charAt(0));
        }

        // 연산자가 / 이고, oprd2 가 0 또는 0에 가까운 값인지 확인
        if (op.equals("/") && (oprd2 == 0 || (-0.0001 < oprd2 && oprd2 < 0.0001))) {
            throw new DivideByZeroException();
        }

        if (op.equals("+")) {
            // 연산자(op) 가 + 인 경우
            return oprd1 + oprd2;
        } else if (op.equals("-")) {
            // 연산자(op) 가 - 인 경우
            return oprd1 - oprd2;
        } else if (op.equals("*")) {
            // 연산자(op) 가 * 인 경우
            return oprd1 * oprd2;
        } else {
            // 연산자(op) 가 / 인 경우
            return oprd1 / oprd2;
        }
    }

    // DivideByZeroException 예외처리 메소드
    public void handleDivideByZeroException() {
        System.out.println("0 혹은 0에 아주 가까운 값으로 나누려고 시도하여\n프로그램이 중단되었습니다.");
    }
    // UnknownOpException 예외처리 메소드
    public void handleUnknownOpException(UnknownOpException e) {
        System.out.println(e.getMessage());
        System.out.println("처음부터 다시 시작하세요.");
        System.out.println("연산식을 나타내는 각 라인(line)의 포맷: 연산자 숫자");
        System.out.println("예:+ 3");
        System.out.println("끝내려면 e(혹은 E)를 입력하세요.\n");
        setResult(0);
    }

}
