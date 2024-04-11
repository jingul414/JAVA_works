package first_project;

import java.util.Scanner;

public class sumNums {
	public static int sumNumLoop(int n) {
		int value = 0;
		if(n < 10) {
			value = n;
		}else {
			while(n > 10) {
				value += (n%10);
				n /= 10;
			}
			value += n;
		}
		return value;
	}
	
	public static int sumNumRecursion(int n) {
		int value = 0;
		if(n < 10) {
			return n;
		}else {
			return sumNumRecursion(n/10) + n%10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum_loop, sum_recursion;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		
		sum_loop = sumNumLoop(num);
		sum_recursion = sumNumRecursion(num);
		
		System.out.println("반복 결과: " + sum_loop);
		System.out.println("재귀 결과: " + sum_recursion);
	}

}
