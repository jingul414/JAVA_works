package first_project;

import java.util.Scanner;

public class numerals {
	
	//10의 배수로 자리수를 반환하는 메소드
	public static int findDigit(int input) {
		int digit = 1;
		while(input >= 10) {
			input /= 10;
			digit *= 10;
		}
		return digit;
	}
	

	//숫자 한자리를 받아서 해당하는 서수를 반환하는 메소드
	public static String findOneNumeral(int n) {
		String numerals = "";
		switch (n) {
		case 0: 
			numerals = "영 ";
			break;
		case 1:
			numerals = "하나 ";
			break;
		case 2:
			numerals = "둘 ";
			break;
		case 3:
			numerals = "셋 ";
			break;
		case 4:
			numerals = "넷 ";
			break;
		case 5:
			numerals = "다섯 ";
			break;
		case 6:
			numerals = "여섯 ";
			break;
		case 7:
			numerals = "일곱 ";
			break;
		case 8:
			numerals = "여덟 ";
			break;
		case 9:
			numerals = "아홉 ";
			break;
		default:
			System.out.println("옳바른 수가 아님");
			break;
		}
		return numerals;
	}

	//입력받은 수에 해당하는 서수를 반복문을 이용하여 찾는 메소드
	static public String findAllNumeralsLoop(int input) {
		String allNumrals = "";
		int num = findDigit(input); //자릿수에 해당하는 변수
		for(; num > 0; num/=10) {
			allNumrals += findOneNumeral(input / num);
			input %= num;
		}
		return allNumrals;
	}
	
	//입력받은 수에 해당하는 서수를 재귀를 이용하여 찾는 메소드
	static public String findAllNumeralsRecurs(int input) {
		//재귀 이용 
		String allNumerals = "";
		
		allNumerals += findOneNumeral(input % 10);
		input /= 10;
		if(input > 0) return findAllNumeralsRecurs(input) + allNumerals;
		else return allNumerals;
	}
	
	//메인
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLoop, strRecurs; //strLoop: 반복문을 이용한 결과, strRecurs: 재귀를 이용한 결과
		int num;				   //입력받을 정수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		strLoop = findAllNumeralsLoop(num);
		strRecurs = findAllNumeralsRecurs(num);
		
		System.out.println("반복 메소드 결과");
		System.out.println("  정수내의 숫자들: " + strLoop);
		System.out.println("재귀 메소드 결과");
		System.out.println("  정수내의 숫자들: " + strRecurs);
	}

}
