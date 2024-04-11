package first_project;

import java.util.Scanner;

public class BinToOct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binNum, digit_first, digit_second, digit_third, digit_fourth;
		int octNum = 0;
		Scanner scan = new Scanner(System.in);
		int digit_1 = 0, digit_2 = 0, digit_3 = 0, digit_4 = 0;
		System.out.print("12 비트(bit)의 이진수를 입력하세요: ");
		
		binNum = scan.next();

		digit_first = binNum.substring(0, 3);
		digit_second = binNum.substring(3, 6);
		digit_third = binNum.substring(6, 9);
		digit_fourth = binNum.substring(9, 12);
		
		digit_1 = Integer.parseInt(digit_first, 2);
		digit_2 = Integer.parseInt(digit_second, 2);
		digit_3 = Integer.parseInt(digit_third, 2);
		digit_4 = Integer.parseInt(digit_fourth, 2);
		
		System.out.println("이진수 " + binNum + "에 해당하는 8진수는 " + (digit_1 * 1000 + digit_2 * 100 + digit_3 * 10 + digit_4) + "이다.");
	
	}

}
