package subject9_2;

public class OverPayCalculator extends BasicPayCalculator {
    private int satWorkTime;    //토요일 근무 시간
    private int sunWorkTime;    //일요일 근무 시간

    public OverPayCalculator(int pay) {
        super(pay);
        satWorkTime = 0;
        sunWorkTime = 0;
    }

    public int getSatWorkTime() {
        return this.satWorkTime;
    }

    public void setSatWorkTime(int satWorkTime) {
        this.satWorkTime = satWorkTime;
    }

    public int getSunWorkTime() {
        return this.sunWorkTime;
    }

    public void setSunWorkTime(int sunWorkTime) {
        this.sunWorkTime = sunWorkTime;
    }
    
    @Override
    public void calcPay(){
        if(dayWorkTime <= 40){
            weekPay = dayWorkTime * dayHourPay;
        }else{
            weekPay = 40 * dayHourPay + (dayWorkTime-40) * dayHourPay * 1.5;
        }

        weekPay += getSatWorkTime() * dayHourPay * 2;
        weekPay += getSunWorkTime() * dayHourPay * 3;
    }

}

