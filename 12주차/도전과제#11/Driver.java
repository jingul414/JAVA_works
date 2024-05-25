package subject_c;

public class Driver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("계산기 시작합니다.");
        System.out.println("연산식을 나타내는 각 라인(line)의 포맷 : 연산자 숫자");
        System.out.println("예:+ 3");
        System.out.println("끝내려면 e(혹은 E)를 입력하세요.\n");

        do {
            try {
                calculator.inputData();
            } catch (UnknownOpException e) {
                calculator.handleUnknownOpException(e);
            } catch (DivideByZeroException e) {
                calculator.handleDivideByZeroException();
                break;
            }
        } while (!calculator.getInput().equals("e") && !calculator.getInput().equals("E"));
    }
}
