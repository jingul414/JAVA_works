package first_project;

import java.util.Scanner;

public class MJ_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, admit_year, admit_type, id;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("입학 연도는? ");
		admit_year = sc.next();
		System.out.print("입학 유형은(신입생 혹은 편입생)? ");
		admit_type = sc.next();
		
		id = "60" + admit_year.substring(2);
		if(admit_type.equals("신입생")) {
			id += "2001";
		}else {
			id += "5017";
		}
		
		System.out.println("이름: " + name);
		System.out.println("학번: " + id);
	}

}
