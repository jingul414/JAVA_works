package subject;

public class Course {
	private static int courseCount = 0; //Course 객체들의 수 
	private String name_;				//교과목명
	private int maxStu_;				//최대 수강 인원수
	private int currentStu_;			//수강 인원수
	private int gpa_;					//학점수
	
	public Course(String name, int stu, int gpa) {
		this.name_ = name;
		this.maxStu_ = stu;
		this.gpa_ = gpa;
		this.currentStu_ = 0;
		Course.courseCount++;
	}

	public static int getCourseCount() {
		return courseCount;
	}

	public String getName() {
		return name_;
	}

	public int getMaxStu() {
		return maxStu_;
	}

	public int getCurrentStu() {
		return currentStu_;
	}

	public int getGpa() {
		return gpa_;
	}

	public void stat() {
		System.out.println(getName() + "\t\t" + getMaxStu() + "\t\t" + getCurrentStu());
	}
	
	public void setName(String name) {
		this.name_ = name;
	}
	
	public void setMaxStu(int stu) {
		this.maxStu_ = stu;
	}
	
	public void setGPA(int gpa) {
		this.gpa_ = gpa;
	}
	
	public void setCurrentStu() {
		this.currentStu_ ++;
	}
	
	
	
}
