package subject9_2;

public class DangerPayCalculator extends BasicPayCalculator{
    private int dangerWorkTime; // 위험 근무 시간

    public DangerPayCalculator(int pay) {
        super(pay);
        dangerWorkTime = 0;
    }

    public int getDangerWorkTime() {
        return this.dangerWorkTime;
    }

    public void setDangerWorkTime(int dangerWorkTime) {
        this.dangerWorkTime = dangerWorkTime;
    }

    @Override
    public void calcPay(){
        if(dayWorkTime <= 40){
            weekPay = dayWorkTime * dayHourPay;
        }else{
            weekPay = 40 * dayHourPay + (dayWorkTime-40) * dayHourPay * 1.5;
        }
        weekPay += getDangerWorkTime() * dayHourPay * 5;
    }
}
