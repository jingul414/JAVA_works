package subject_1;

public class Employee {
    private String name;    // 이름
    private String num;     // 번호
    private int index;      // num에서 숫자가 아닌 문자의 위치
    private final int NUM_LENGTH = 6;   //번호의 길이 지정

    public Employee(String name, String num) throws NumberLengthException, NumberCharacterException { 
        this.name = name;
        if(num.length() != NUM_LENGTH){
            throw new NumberLengthException("길이가 " + num.length() + "인 " + num + "은 유효하지 않다: 길이는 6이어야 한다.");
        }
        if(!isNumeric(num)){
            throw new NumberCharacterException(num + "은 틀린 번호이다: 숫자가 아닌 문자 (" + num.charAt(index) + ") 를 포함한다" );
        }
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public String getNum() {
        return this.num;
    }
    
    //숫자만으로 이루어져 있는지 확인해서 true, 아니면 false를 리턴
    public Boolean isNumeric(String num){
        for(index = 0; index < NUM_LENGTH; index++){
            if( (num.charAt(index) < '0') || (num.charAt(index) > '9') ){
                return false;
            }
        }
        return true;
    }

    public void printData() {
        System.out.println("이름: " + getName());
        System.out.println("번호: " + getNum());
    }

}
