public class SimpleDeposit extends Deposit{
    //단리 정기예금
    private int principal;          //원금
    private double princAndInter;   //원리금

    public SimpleDeposit(String name, String account, int date, double rate, int principal) {
        super(name, account, date, rate);
        this.principal = principal;
        
    }
    @Override
    public void calcInterest() {
        //단리 정기예금 : p * (1 + r/12 * n), 출처: 과제 설명문서
        this.princAndInter = principal * (1 + rate / 12 * date);
    }

    @Override
    public void showInfo() {
        System.out.println("정기예금(단리)");
        super.showInfo();
        System.out.println("원금: " + principal);
        System.out.println("원리금: " + (int)princAndInter);
    }

}
