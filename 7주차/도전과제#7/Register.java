package subject;

public class Register {
	private Course course;		//Course 를 가르키는 변수
	private Student student;	//Student 를 가르키는 변수
	
	public Register(Student stu, Course course) {
		boolean tmp1 = false;
		boolean tmp2 = false;
		
		//정원이 안찾다는 조건과 학생의 학점이 초과하지 않았다는 조건이 모두 충종되야 등록
		if(course.getMaxStu() > course.getCurrentStu()) {
			tmp1 = true;
		}else {
			System.out.println("정원이 차서 수강 신청할 수 없다.");
		}
		
		if(stu.getEnrollCredit() + course.getGpa() <= stu.getMaxCredit()) {
			tmp2 = true;
		}else {
			System.out.println("학점 초과로 수강신청할 수 없다.");
		}
		
		if(tmp1 && tmp2) {
			this.course = course;
			course.setCurrentStu();
			this.student = stu;
			stu.setEnrollCredit(stu.getEnrollCredit() + course.getGpa());
		}
	}
	
	public void printing() {
		System.out.println(this.student.getStuName() + ": " + this.course.getName() + " 수강 신청");
	}
}
