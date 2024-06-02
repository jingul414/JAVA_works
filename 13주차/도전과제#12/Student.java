package subject_c;

import java.util.ArrayList;

public class Student {
    private String id;              // 학번
    private String name;            // 성명
    private String gender;          // 성별
    private String phoneNumber;     // 전화번호
    private String address;         // 주소
    private String depart;          // 학과
    private ArrayList<String> hobby;//취미
    private String selfIntroduce;   // 자기소개

    public Student(String id, String name, String gender, String phoneNumber, String address, String depart, ArrayList<String> hobby, String selfIntroduce){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.depart = depart;
        this.hobby = hobby;
        this.selfIntroduce = selfIntroduce;
    }

    public void printInfo(){
        System.out.print(id + "\t" + name + "\t\t" + gender + "\t" + phoneNumber + "\t" + address);
        //공백 개수를 맞추기 위한 조건문, 설계에 없음
        int tab_count = (20 - address.length()) / 4;
        if((20 - address.length())%4 >2){
            for(int i = 0; i < tab_count+1; i++){
                System.out.print("\t");
            }
        }else{
            for(int i = 0; i < tab_count; i++){
                System.out.print("\t");
            }
        }

        System.out.print(depart + "\t\t");

        //공백의 수를 세기 위해 하나의 String 으로 병합
        String hobby_tmp = "";  
        for(String hobbies : hobby){
            hobby_tmp += hobbies + " ";
        }

        System.out.print(hobby_tmp);
        //공백 개수를 맞추기 위한 조건문, 설계에 없음
        tab_count = (20 - hobby_tmp.length()) / 4;
        for (int i = 0; i < tab_count; i++) {
            System.out.print("\t");
        }

        System.out.println(selfIntroduce);
        
    }
}
