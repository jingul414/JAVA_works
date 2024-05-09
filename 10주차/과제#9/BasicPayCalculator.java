package subject9_2;

public class BasicPayCalculator {
    protected double weekPay;      //주급
    protected int dayHourPay;      //시급
    protected int dayWorkTime;  //평일 근무 시간
    

    public BasicPayCalculator(int pay){
        this.dayHourPay = pay;
        dayWorkTime = 0;
    }

    public void addWorkTime(int time){
        dayWorkTime += time;
    }

    public void calcPay(){
        weekPay = 0;
    }

    public double getWeekPay(){
        return weekPay;
    }
}
