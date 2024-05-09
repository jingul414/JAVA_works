package subject9_2;

public class Driver {
    public static void main(String[] args) {
        OverPayCalculator employe1 = new OverPayCalculator(8000);
        employe1.addWorkTime(50);
        employe1.setSatWorkTime(6);
        employe1.setSunWorkTime(2);
        employe1.calcPay();
        System.out.println("주말 근무 직원의 주급: " + employe1.getWeekPay());

        DangerPayCalculator employe2 = new DangerPayCalculator(10000);
        employe2.addWorkTime(36);
        employe2.setDangerWorkTime(6);
        employe2.calcPay();
        System.out.println("위험 근무 직원의 주급: " + employe2.getWeekPay());
    }
    
}
