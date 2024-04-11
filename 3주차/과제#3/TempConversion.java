package first_project;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tem = 0, cel = 0, fah = 0; //온도, 섭씨, 화씨
		char temp_unit; //섭씨인지 화씨인지를 표시할 문자
		Scanner scan = new Scanner(System.in);
		System.out.print("온도를 입력하세요: ");
		tem = scan.nextDouble();
		
		System.out.print("\n화씨 온도이면 'F'(혹은 'f')를 입력하고 섭씨 온도이면 'C'(혹은'c')를 입력하세요: ");
		temp_unit = scan.next().charAt(0);

		if(temp_unit == 'F' || temp_unit == 'f') {
			cel = (tem - 32) * 5 / 9;
			System.out.println("\n화씨 " + tem + "도 = 섭씨 " + cel + "도");
		}else if(temp_unit == 'C' || temp_unit == 'c') {
			fah = tem * 9 / 5 + 32;
			System.out.println("\n섭씨 " + tem + "도 = 화씨 " + fah + "도");
		}else {
			System.out.println("\n섭씨도 화씨도 아니다.");
			System.out.println("온도변환을 할 수 없다.");
			System.out.println("다음번에는 화씨 온도이면 'F'(혹은 'f')를 입력하고 섭씨 온도이면 'C'(혹은'c')를 입력하세요.");
		}
	}

}
