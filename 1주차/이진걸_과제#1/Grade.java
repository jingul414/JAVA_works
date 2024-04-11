package first_project;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade_bef = 0, grade = 0, grade_aft = 0;
		double grade_fin = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실습전 과제 점수를 입력하세요: ");
		grade_bef = sc.nextInt();
		System.out.print("실습 과제 점수를 입력하세요: ");
		grade = sc.nextInt();
		System.out.print("실습후 과제 점수를 입력하세요: ");
		grade_aft = sc.nextInt();
		
		System.out.println("실습전 과제 점수 = " + grade_bef );
		System.out.println("실습 과제 점수 = " + grade );
		System.out.println("실습후 과제 점수 = " + grade_aft);
		
		grade_fin = ( ((double)grade_bef / 20 + (double)grade_aft / 30 ) * 0.4 * 0.5 + (double)grade / 25 * 0.6 ) * 100;
		//0.4 = 실습 전후 과제의 반영 비율, 0.5 = 실습 전후 두 과제의 반영 비율이 동일하기때문에 2로 나누어줌, 0.6 = 실습 과제의 반영비율
		
		System.out.println("최종 실습 점수 =  " + grade_fin);
	}

}
