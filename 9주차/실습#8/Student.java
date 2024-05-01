package subject8_1;

public class Student {
    String stuID;
    String name;

    public Student(String id, String name) {
        this.stuID = id;
        this.name = name;
    }

    public String getStuID() {
        return this.stuID;
    }

    public String getName() {
        return this.name;
    }

    public void getInfo(){
        System.out.println("이름 : " + getName());
        System.out.println("학번 : " + getStuID());
    }

}
