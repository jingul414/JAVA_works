package first_project;
import java.util.Scanner;
public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee = 0, exc = 0, cnt_500 = 0, cnt_100 = 0, cnt_50 = 0, cnt_10 = 0, cnt_5 = 0, cnt_1 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건의 가격<1,000원 이하>을 입력하세요:");
		fee = sc.nextInt();
		System.out.println(fee + "원 짜리 물건을 샀고 1,000원을 내셨습니다.");
		exc = 1000 - fee;
		System.out.println("거스름돈은 " + exc + "원입니다.");
		System.out.println("거스름돈의 내역은 다음과 같습니다.\n");
		
		cnt_500 = exc / 500;
		System.out.println("500원 짜리 동전 갯수 = " + cnt_500);
		
		cnt_100 = exc % 500 / 100;
		System.out.println("100원 짜리 동전 갯수 = " + cnt_100);
		
		cnt_50 = exc % 100 / 50;
		System.out.println("50원 짜리 동전 갯수 = " + cnt_50);

		cnt_10 = exc % 50 / 10;
		System.out.println("10원 짜리 동전 갯수 = " + cnt_10);

		cnt_5 = exc % 10 / 5;
		System.out.println("5원 짜리 동전 갯수 = " + cnt_5);

		cnt_1 = exc % 5;
		System.out.println("1원 짜리 동전 갯수 = " + cnt_1);
	}

}
