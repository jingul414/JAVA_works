package subject_c;

public abstract class TestQuestion {
    protected String question; // 문제

    public String getQuestion() {
        return this.question;
    }

    public abstract void readQuestion();

    public void printQuestion() {
        System.out.println(getQuestion());
    }
}
