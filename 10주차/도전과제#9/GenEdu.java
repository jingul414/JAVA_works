package subject9_3;

public class GenEdu extends Course{
    private String type; // 이수구분
    
    public GenEdu(String name, String num, String type) {
        super(name, num);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("이수구분: " + getType());
    }

}
