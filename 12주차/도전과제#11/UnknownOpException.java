package subject_c;

public class UnknownOpException extends Exception {
    public UnknownOpException() {
        super("허용되지 않은 연산자로 인한 예외");
    }

    public UnknownOpException(char op){
        super(op + " 는 허용되지 않는 연산자이다.");
    }

    public UnknownOpException(String message) {
        super(message);
    }
}
