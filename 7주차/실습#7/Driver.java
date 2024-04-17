package subject7_1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		CheckCardAccount card = new CheckCardAccount("선남", "1001", "0912");
		Scanner scan = new Scanner(System.in);
		card.deposit(100000);
		do {
			card.buying();
			System.out.print("계속하시겠습니까?(true 혹은 false): ");
		} while (scan.nextBoolean());
		
		card.withdraw(20000);
		
		card.stat();
	}
}
