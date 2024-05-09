package subject9_3;

public class Elective extends Course{
    public Elective(String name, String num) {
        super(name, num);
    }
    @Override
    public void printInfo(){
        System.out.println("선택과목:");
        super.printInfo();
    }
}
