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

    // 배열을 1씩 뒤로 미는 메소드
    public void pushArr(int index) {
        for (int i = numStu - 1; i >= index; i--) {
            stuArr[i + 1] = stuArr[i];
            stuArr[i] = null;
        }
    }

    // 학생을 배열에 더하는 메소드
    public void addStu(Student stu) {
        if (numStu >= maxStu) {
            System.out.println("출석부의 크기 부족으로 추가할 수 없습니다");
        } else {
            if (numStu == 0) {
                // 출석부가 비어있는 경우
                stuArr[numStu] = stu;
                numStu++;
            } else {
                // 출석부가 비어있지 않은 경우
                int i = 0;
                for (; i < numStu; i++) {
                    if(stuArr[i].getId() > stu.getId()){
                        pushArr(i);
                        break;
                    }
                }
                stuArr[i] = stu;

                numStu++;
            }
        }
    }

    // id와 일치하는 학생의 index를 돌려줌
    public int getIndex(int id) {
        int index = -1;
        for (int i = 0; i < numStu; i++) {
            if (stuArr[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

    // id와 일치하는 학생을 배열에서 삭제함
    public void delStu(int id) {
        if (getIndex(id) == -1) {
            System.out.println("주어진 학생이 출석부에 없어 삭제할 수 없습니다");
        } else {
            for (int i = getIndex(id); i < numStu; i++) {
                stuArr[i] = stuArr[i + 1];
            }
            numStu--;
        }
    }

    // id와 일치하는 학생의 이름을 반환함
    public String getStuName(int id) {
        String name = "";
        if (getIndex(id) != -1) {
            name = stuArr[getIndex(id)].getName();
            System.out.println("\n" + id + "의 이름: " + name);
        } else {
            System.out.println("주어진 학생이 출석부에 없습니다");
        }
        return name;
    }

    // 모든 정보를 출력함
    public void printing() {
        System.out.println("\n출석부\n");
        System.out.println("교과목명: " + this.className);
        System.out.println("학번\t이름");
        for (int i = 0; i < numStu; i++) {
            stuArr[i].printing();
        }
    }
}
