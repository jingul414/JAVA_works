
public class Driver {
    public static void main(String[] args) {
        final int MAX_SIZE = 3;    //예적금의 최대 개수
        Deposit[] deposits = new Deposit[MAX_SIZE];
        deposits[0] = new SimpleDeposit("선남", "100", 12, 0.05, 10000000);
        deposits[1] = new CompoundDeposit("선녀", "200", 12, 0.05, 10000000);
        deposits[2] = new TermDeposit("길동", "300", 12, 0.05, 100000);

        for(int i = 0; i < MAX_SIZE; i++) {
            deposits[i].calcInterest();
            deposits[i].showInfo();
            System.out.println("");
        }
    }
    
}
