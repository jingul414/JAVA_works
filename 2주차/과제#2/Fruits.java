package first_project;

import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits, fruit_1, fruit_2, fruit_3, fruit_4;  
		int index = 0;
		Scanner scan = new Scanner(System.in);
		
		fruits = scan.nextLine();
		index = fruits.indexOf(" ");
		
		fruit_1 = fruits.substring(0,index);
		fruits = fruits.substring(index + 1);
		index = fruits.indexOf(" ");

		fruit_2 = fruits.substring(0, index);
		fruits = fruits.substring(index + 1);
		index = fruits.indexOf(" ");

		fruit_3 = fruits.substring(0, index);
		fruit_4 = fruits.substring(index+1);
		
		System.out.println(fruit_4 + " " + fruit_3 + " " + fruit_2 +" " + fruit_1);

	}

}
