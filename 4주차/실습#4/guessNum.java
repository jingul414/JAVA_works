package first_project;

import java.util.Random;
import java.util.Scanner;

public class guessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num = -1;
		int cnt = 0;
		String answer;
		while (true) {
			int randomNum = random.nextInt(101);
			while (randomNum != num) {
				System.out.print("추측한 숫자를 입력하세요(종료를 원하면 -99): ");
				num = sc.nextInt();
				if (num == -99) break;
				cnt++;
				if (randomNum > num) {
					System.out.println("추측한 숫자가 작다");
				} else if (randomNum < num) {
					System.out.println("추측한 숫자가 크다");
				} else {
					System.out.println("추측한 숫자가 맞다");
					System.out.println("추측한 횟수: " + cnt);
				}
			}
			System.out.print("계속하기를 원하는가? (예 혹은 아니오): ");
			answer = sc.next();
			if ( answer.equals("아니오") ) break;
		}

	}

}
