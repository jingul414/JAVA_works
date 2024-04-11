package subject1_1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		City city = new City();
		Scanner sc = new Scanner(System.in);
		city.inputData();
		city.outputData();
		System.out.print("계속하기를 원하세요(true 혹은 false)?: ");
		while(sc.nextBoolean()) {
			city.inputData();
			city.outputData();
			System.out.print("계속하기를 원하세요(true 혹은 false)?: ");
		}
			
	}

}
