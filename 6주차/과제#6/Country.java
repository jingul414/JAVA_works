package subject1_2;

import java.util.Scanner;

public class Country {
	private String name_;
	private int popul_;
	private double popRate_;
	Scanner scan = new Scanner(System.in);
	private int year_;
	
	public void inputData(int year) {
		year_ = year;
		
		System.out.println("국가 데이터를 입력하세요");
		System.out.print("국가명: ");
		name_ = scan.next();
		
		System.out.print("인구수: ");
		popul_ = scan.nextInt();
		
		while(popul_ < 0) {
			System.out.println("인구수가 음수이다");
			System.out.print("인구수: ");
			popul_ = scan.nextInt();
		}
		
		System.out.print("연간 인구 증감율(%): ");
		popRate_ = scan.nextDouble();
	}

	public String getName_() {
		return name_;
	}

	public int getPopul_() {
		return popul_;
	}

	public double getPopRate_() {
		return popRate_;
	}

	public void setData(String name, int pop, double rate) {
		this.name_ = name;
		this.popul_ = pop;
		this.popRate_ = rate;
	}
	
	public int calcPopLate() {
		return (int)(getPopul_() * Math.pow(1+getPopRate_()/100.0, this.year_));
	}
	
	public void outputData() {
		System.out.println("국가 데이터");
		System.out.println("  국가명 = " + getName_());
		System.out.println("  인구수= " + getPopul_());
		System.out.println("  연간 인구 증감율 = " + getPopRate_() + "%");
		System.out.println("\n" + getName_() +"의 10년후 인구: " + calcPopLate() + "\n");
	}
}
