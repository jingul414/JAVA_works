package subject;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Course course1 = new Course("알고리즘", 30, 4);
		Course course2 = new Course("자료구조", 25, 3);
		System.out.println("수강 신청 전\n");
		
		System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
		course1.stat();
		course2.stat();
		System.out.println("");
		
		course1.setMaxStu(36);
		course2.setMaxStu(28);
		
		System.out.println("수강 신원 증원 후\n");
		System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
		course1.stat();
		course2.stat();
		System.out.println("");
		
		System.out.println("생성된 교과목들의 수: " + Course.getCourseCount() + "\n");
		
		Student stu1 = new Student("2101", "선남", 18);
		Student stu2 = new Student("2102", "선녀", 21);
		Student stu3 = new Student("2103", "길동", 18);
		
		System.out.println("학번\t이름\t신청 학점수");
		stu1.stat();
		stu2.stat();
		stu3.stat();
		System.out.println("");
		
		Register reg1 = new Register(stu1, course1);
		Register reg2 = new Register(stu2, course1);
		Register reg3 = new Register(stu2, course2);
		Register reg4 = new Register(stu3, course1);
		Register reg5 = new Register(stu3, course2);
		
		reg1.printing();
		reg2.printing();
		reg3.printing();
		reg4.printing();
		reg5.printing();		
		
		System.out.println("\n수강 신청 후\n");
		System.out.println("교과목명\t\t최대 학생수\t현재 학생수");
		course1.stat();
		course2.stat();
		System.out.println("");
		
		System.out.println("학번\t이름\t신청 학점수");
		stu1.stat();
		stu2.stat();
		stu3.stat();
		System.out.println("");

	}
}
