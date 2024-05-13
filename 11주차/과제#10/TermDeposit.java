public class TermDeposit extends Deposit {
    //적금
    private int monthlyPay;         //월불입액
    private double princAndInter;   //원리금

    public TermDeposit(String name, String account, int date, double rate, int monthlyPay) {
        super(name, account, date, rate);
        this.monthlyPay = monthlyPay;
    }

    @Override
    public void calcInterest() {
        //정기 적금 : m * n + m * (r/12) * (n * (n+1) / 2), 출처: 과제 설명문서
        this.princAndInter = monthlyPay * date + monthlyPay * (rate / 12) * (date * (date + 1) / 2);
    }

    @Override
    public void showInfo() {
        System.out.println("정기적금");
        super.showInfo();
        System.out.println("월불입금액: " + monthlyPay);
        System.out.println("원리금: " + (int)princAndInter);
    }
}
