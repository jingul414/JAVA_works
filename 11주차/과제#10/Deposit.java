public abstract class Deposit {
    //예금
    protected String name;      //예금주 이름
    protected String account;   //계좌번호
    protected int date;         //계약기간
    protected double rate;      //연이율

    public Deposit(String name, String account, int date, double rate){
        this.name = name;
        this.account = account;
        this.date = date;
        this.rate = rate;
    }

    //이자 계산
    public abstract void calcInterest();

    //기본 정보 출력
    public void showInfo() {
        System.out.println("예금주 이름: " + name);
        System.out.println("계좌번호: " + account);
        System.out.println("계약기간: " + date);
        System.out.println("연이율: " + rate);
    }
}
