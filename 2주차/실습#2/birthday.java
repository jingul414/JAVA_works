package first_project;
import java.util.Scanner;

public class birthday {

	public static void main(String[] args) {
		String name, birthday, year, month, day;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name = scan.next();
		System.out.print("생년월일(mm/dd/yy)을 입력하세요: ");
		birthday = scan.next();
		
		index = birthday.indexOf("/");
		
		month = birthday.substring(0, index);
		birthday = birthday.substring(index+1);
		
		index = birthday.indexOf("/");
		
		day = birthday.substring(0, index);
		year = birthday.substring(index+1);
		
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + year + "." + month + "." + day);

	}

}
