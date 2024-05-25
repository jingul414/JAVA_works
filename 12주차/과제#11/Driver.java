package subject_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10]; //직원을 저장
        int count = 0;      //직원의 인원 수를 저장
        String condition;   //계속 할지 여부를 저장(예, 아니오)
        String name;        //직원의 이름을 저장
        String num;         //직원의 번호를 저장
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("직원 " + (count+1) + "의 이름을 입력하세요: ");
            name = sc.next();
            System.out.print("직원 " + (count+1) + "의 번호를 입력하세요(6개의 숫자들): ");
            num = sc.next();
            try {
                employee[count] = new Employee(name, num);
                count++;
            } catch (NumberLengthException e) {
                //길이가 6이 아닌 경우
                System.out.println(e.getMessage());
                System.out.println("직원 " + (count+1) + "의 데이터를 다시 입력하세요");
            } catch (NumberCharacterException e){
                //숫자가 아닌 경우
                System.out.println(e.getMessage());
                System.out.println("직원 " + (count+1) + "의 데이터를 다시 입력하세요");
            }finally{
                System.out.print("계속하기를 원하는가(예 혹은 아니오)? ");
                condition = sc.next();
            }
        } while (condition.equals("예"));
        
        for (int i = 0; i < count; i++) {
            System.out.println("\n직원 " + (i+1));
            employee[i].printData();
        }

        sc.close(); //Scanner 객체 종료
    }
    
}
