package subject1_2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Country country = new Country();
		Scanner sc = new Scanner(System.in);
		int year_;
		
		System.out.print("인구를 예측할 연수를 입력하세요: ");
		year_ = sc.nextInt();
		
		country.inputData(year_);
		country.outputData();
		country.setData("미국", 33000000, 0.35);
		country.outputData();
	}

}
