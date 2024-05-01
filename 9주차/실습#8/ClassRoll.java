package subject8_1;

public class ClassRoll {
    private String className;
    private int numStu;
    private int maxStu;
    private Student[] stuArr;

    public ClassRoll(String name) {
        this.className = name;
        this.numStu = 0;
        this.maxStu = 10;
        stuArr = new Student[maxStu];
    }

    public void addStu(Student stu){
        if(numStu < maxStu){
            stuArr[numStu] = stu;
            numStu++;
        }else{
            System.out.println("출석부의 크기 부족으로 추가할 수 없습니다");
        }
    }

    public int getIndex(String id){
        int index = -1;
        for(int i = 0; i < numStu; i++){
            if(stuArr[i].getStuID().equals(id)){
                index = i;
            }
        }
        return index;
    }

    public String getStuName(String id){
        String name = "";
        if(getIndex(id) != -1){
            name = stuArr[getIndex(id)].getName();
            System.out.println(id + "의 이름: " + name);
        }else{
            System.out.println("주어진 학생이 출석부에 없습니다");
        }
        return name;
    }
}
