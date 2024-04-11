package subject1_1;

import java.util.Scanner;

public class City {
	private String name_;
	private int popul_;
	private double popRate_;
	Scanner scan = new Scanner(System.in);
	
	public void inputData() {
		System.out.print("도시이름을 입력하세요: ");
		name_ = scan.next();
		System.out.print("인구를 입력하세요: ");
		popul_ = scan.nextInt();
		while(popul_ < 0) {
			System.out.println("잘못된 인구");
			System.out.print("인구를 입력하세요: ");
			popul_ = scan.nextInt();
		}
		System.out.print("인구 증가율(%)을 입력하세요: ");
		popRate_ = scan.nextDouble();

	}
	
	public String getName() {
		return name_;
	}
	
	public int getPop() {
		return popul_;
	}
	
	public double getRate() {
		return popRate_;
	}
	
	public void outputData() {
		System.out.println("도시 = " + getName());
		System.out.println("인구 = " + getPop());
		System.out.println("인구 증가율 = " + getRate() + "%");
		System.out.println("10년 후 예상 인구: " + calcPopLate());
	}
	
	public int calcPopLate() {
		return (int)(getPop() * Math.pow(1+getRate()/100.0, 10));
	}
}
