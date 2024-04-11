package first_project;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id_org = "hong18", pw_org = "myongji70", id, pw;
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while(cnt <= 5) {
			System.out.print("ID를 입력하세요: ");
			id = sc.next();
			System.out.print("PW를 입력하세요: ");
			pw = sc.next();
			cnt++;
			if(cnt >= 5) {
				System.out.println("접속을 거부합니다.");
				break;
			}
			if(id.equals(id_org) && pw.equals(pw_org)) {
				System.out.println("환영합니다");
				break;
			}else if(!id.equals(id_org)) {
				System.out.println("ID가 틀립니다.");
			}else if(id.equals(id_org) && !pw.equals(pw_org)) {
				System.out.println("PW가 틀립니다.");
			}
			
		}
	}

}
