package subject8_2;

public class ClassRoll {
    String className;
    int numStu;
    int maxStu;
    Student[] stuArr;

    public ClassRoll(String name) {
        this.className = name;
        this.numStu = 0;
        this.maxStu = 30;
        stuArr = new Student[maxStu];
    }

    public void addStu(Student stu){
        if(numStu >= maxStu){
            System.out.println("출석부의 크기 부족으로 추가할 수 없습니다");
        }else{
            
        }
    }

    public int getIndex(int id){
        int index = -1;
        for(int i = 0; i < numStu; i++){
            if(stuArr[i].getId() == id){
                index = i;
            }
        }
        return index;
    }
}
