package subject7_2;

public class Student {
	private String stuID_;		//학번
	private String stuName_;	//학생 이름	
	private int enrollCredit_;	//신청 학점수
	private int maxCredit_;		//최대 학점수
	
	public Student(String stuID, String name, int credit) {
		this.stuID_ = stuID;
		this.stuName_ = name;
		this.maxCredit_ = credit;
		this.enrollCredit_ = 0;
	}

	public String getStuID() {
		return stuID_;
	}

	public String getStuName() {
		return stuName_;
	}

	public int getEnrollCredit() {
		return enrollCredit_;
	}

	public int getMaxCredit() {
		return maxCredit_;
	}
	
	public void stat() {
		System.out.println(getStuID() + "\t" + getStuName() + "\t" + getEnrollCredit());
	}
	
	public void setStuID(String stuID) {
		this.stuID_ = stuID;
	}

	public void setStuName(String stuName) {
		this.stuName_ = stuName;
	}

	public void setEnrollCredit(int enrollCredit) {
		this.enrollCredit_ = enrollCredit;
	}
	
	
}
