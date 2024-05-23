package subject_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ServiceRequests request = new ServiceRequests();
        Scanner sc = new Scanner(System.in);
        int num = 0;    //연산 선택을 저장
        String name;    //이름을 임시 저장
        System.out.println("콜센터 프로그램에 오신 것을 환영합니다.");
        do {
            System.out.println("원하는 연산을 선택하세요: ");
            System.out.println("1 (고객 이름 추가), 2 (고객 이름 삭제), 3(고객 목록 출력), 4(종료)");
            num = sc.nextInt();
            try {
                switch (num) {
                    case 1:
                        // 고객 추가
                        System.out.print("추가할 고객 이름을 입력하세요: ");
                        name = sc.next();
                        request.addCustomer(name);
                        break;
                    case 2:
                        // 고객 삭제
                        System.out.print("삭제할 고객 이름을 입력하세요: ");
                        name = sc.next();
                        request.deleteCustomer(name);
                        break;
                    case 3:
                        // 정보 출력
                        request.printCustomers();
                        break;
                    case 4:
                        System.out.println("종료합니다.");
                        break;
                    default:
                        // 1~4가 아 경우
                        System.out.println("1~4를 입력하세요.");
                        break;
                }
            } catch (ServiceBackUpException e) {
                System.out.println(e.getMessage());
                System.out.println("예외 처리: 죄송합니다. 고객의 이름을 추가할 공간이 없습니다.");
            } catch (NoServiceRequestException e) {
                System.out.println(e.getMessage());
                System.out.println("예외 처리: 고객의 이름이 목록에 없습니다.");
            }
        } while (num != 4);

    }
}
