package first_project;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attend = 0, assign = 0, test = 0; //attend 출석점수, assign 과제점수, test 시험점수
		double grade = 0;
		boolean cheated;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출석점수를 입력하세요: ");
		attend = scan.nextInt();
		System.out.print("과제점수를 입력하세요: ");
		assign = scan.nextInt();
		System.out.print("시험점수를 입력하세요: ");
		test = scan.nextInt();
		System.out.print("부정행위 여부(true 혹은 false): ");
		cheated = scan.nextBoolean();
		
		grade = attend * 0.2 + assign * 0.3 + test * 0.5;
		
		System.out.println("총점: "+ grade);
		
		if(cheated) {
			System.out.println("학점: F");
		}else {
			if(90 <= grade && grade <= 100) {
				System.out.println("학점: A");
			}else if(80 <= grade && grade <= 89) {
				System.out.println("학점: B");
			}else if(70 <= grade && grade <= 79) {
				System.out.println("학점: C");
			}else if(60 <= grade && grade <= 69){
				System.out.println("학점: D");
			}else {
				System.out.println("학점: F");
			}
		}
	}

}
