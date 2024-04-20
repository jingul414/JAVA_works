package subject;

public class Register {
	private Course course;		//Course 를 가르키는 변수
	private Student student;	//Student 를 가르키는 변수
	
	public Register(Student stu, Course course) {
		if(course.getMaxStu() > course.getCurrentStu()) {
			this.course = course;
			course.setCurrentStu();
		}else {
			System.out.println("정원이 차서 수강 신청할 수 없다.");
		}
		
		if(stu.getEnrollCredit() + course.getGpa() <= stu.getMaxCredit()) {
			this.student = stu;
			stu.setEnrollCredit(stu.getEnrollCredit() + course.getGpa());
		}else {
			System.out.println("학점 초과로 수강신청할 수 없다.");
		}
	}
	
	public void printing() {
		System.out.println(this.student.getStuName() + ": " + this.course.getName() + " 수강 신청");
	}
}
