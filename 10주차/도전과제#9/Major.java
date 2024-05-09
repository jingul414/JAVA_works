package subject9_3;

public class Major extends Course{
    private String major;       // 전공
    private String preSubject;  // 선수과목

    public Major(String name, String num, String major, String pre) {
        super(name,num);
        this.major = major;
        this.preSubject = pre;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPreSubject() {
        return this.preSubject;
    }

    public void setPreSubject(String preSubject) {
        this.preSubject = preSubject;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("전공: " + getMajor());
        System.out.println("선수과목: " + getPreSubject());
    }

}
