package first_project;

import java.util.Scanner;

public class romanToNum {
	
	//로마숫자를 한글자를 받아서 숫자로 변환하는 메소드
	public static int oneRomanToNum(char c) {
		int num;
		switch (c) {
		case 'I': 
			num = 1;
			break;
		case 'V': 
			num = 5;
			break;
		case 'X': 
			num = 10;
			break;
		case 'L': 
			num = 50;
			break;
		case 'C': 
			num = 100;
			break;
		case 'D': 
			num = 500;
			break;
		case 'M': 
			num = 1000;
			break;
		default:
			num = -1;
			break;
		}
		return num;
	}
	
	//문자열 형태의 로마숫자를 십진수로 변환하는 메소드
	public static int romanToDec(String roman) {
		int num_dec = 0;	//최종 결과값
		int prev = 0;		//이전 위치의 로마숫자
		int tmp = 0;		//특정 위치의 로마숫자
		for(int i = roman.length() - 1; i >= 0; i--) {
			tmp = oneRomanToNum(roman.charAt(i));
			if(tmp < prev) {
				num_dec -= tmp;
			}else {
				num_dec += tmp;
			}
			prev = tmp;
		}
		return num_dec;
	}
	
	//십진수 숫자를 매개변수로 받아 8진수로 변환하는 메소드
	public static String decToOct(int num) {
		String num_oct = "";	//8진수 스트링
		if(num > 0) return num_oct + decToOct(num / 8) + num % 8;
		else return num_oct;
	}
	
	public static void main(String[] args) {
		String roman;
		int num_dec;
		String num_oct;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("로마 숫자를 입력하세요: ");
		roman = sc.next();
		num_dec = romanToDec(roman);
		
		//1미만이거나 5000이상일 경우
		while(num_dec < 1 || 5000 <= num_dec){
            		System.out.println("잘못 입력된 로마숫자");
        		System.out.print("로마 숫자를 입력하세요: ");
    			roman = sc.next();
        		num_dec = romanToDec(roman);
        	}
		
		num_oct = decToOct(num_dec);
		
		System.out.println("10진수로 변환한 숫자: " + num_dec);
		System.out.println("8진수로 변환한 숫자: " + num_oct);
	}

}
