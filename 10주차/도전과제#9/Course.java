package subject9_3;

public class Course {
    protected String name;      //과목의 이름
    protected String number;    //과목의 번호

    public Course(String name, String num) {
        this.name = name;
        this.number = num;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void printInfo(){
        System.out.println("교과목명: " + getName());
        System.out.println("교과목 번호: " + getNumber());
    }
}
