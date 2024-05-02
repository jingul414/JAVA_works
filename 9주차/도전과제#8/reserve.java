package subject8_3;

import java.util.Scanner;

public class reserve {
    static String[] pack = {"제주도", "경주", "설악산"};
    static boolean[][] reservation = new boolean[3][10];
    static Scanner sc = new Scanner(System.in);

    //여행상품을 출력함
    public static void printing(){
        System.out.println("====여행 상품 목록====");
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + ". " + pack[i]);
        }
    }

    //여행상품을 선택함
    public static int choosePack(){
        int tmp;
        System.out.print("예약을 원하는 여행 상품의 번호를 입력하세요: ");
        tmp = sc.nextInt();
        while(tmp < 0 || tmp > 3){
            System.out.println("유효하지 않은 여행 상품 번호! 다시 입력하세요.");
            System.out.print("예약을 원하는 여행 상품의 번호를 입력하세요: ");
            tmp = sc.nextInt();
        }
        return tmp;
    }

    //여행 상품에 선택된 좌석들의 수를 반환함
    public static int countReserve(int pack){
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            if(reservation[pack][i]){
                cnt++;
            }
        }
        return cnt;
    }

    //예약될 좌석의 첫자리를 반환함
    public static int getFirst(int pack, int person){
        int first = 0;
        for(int i = 0; i < 10; i++){
            if(reservation[pack][i]) first++;
        }
        
        return first;
    }
    public static void main(String[] args) {
        String keep;        //예약을 계속할지를 결정할 String
        int packNum;        //여행상품의 번호  

        //Keep이 Yes인 동안 계속 반복
        do{
            printing();
            String name;    //예약자 이름
            int personCnt;  //예약을 원하는 인원수
            boolean tmp1;   //좌석이 충분한지 확인할 변수
            int first;      //예약의 첫번째 좌석을 나타내는 변수
            
            //정보가 옳바른지 확인하고 정보 저장
            do{
                packNum = choosePack();
                System.out.print("이름을 입력하세요: ");
                name = sc.next();
                System.out.print("여행자 수를 입력하세요: ");
                personCnt = sc.nextInt();
                tmp1 = true;
                first = getFirst(packNum, personCnt);

                while(personCnt < 0 || personCnt > 10 ){
                    System.out.println("유효하지 않은 여행자 수! 다시 입력하세요.");
                    System.out.print("여행자 수를 입력하세요: ");
                    personCnt = sc.nextInt();
                }
                if(first + personCnt > 10){
                    System.out.println("좌석이 충분하지 않음! 다시 입력하세요");
                    tmp1 = false;
                }
            } while (!tmp1);

            //예약 목록을 주어진 인원수 만큼 true로 바꿈
            for(int i = first; i < first + personCnt; i++){
                System.out.println(i);                
                reservation[packNum][i] = true; 
            }

            System.out.println(name + "으로 " + personCnt + "명 예약 확정됨.");
            System.out.println("예약 상품 : " + pack[packNum-1] + ". 좌석 번호: " +
            (first+1) + "-" + countReserve(packNum) );

            System.out.print("예약을 계속하나요(Yes 혹은 No)?: ");
            keep = sc.next();
        } while (keep.equals("Yes"));

    }
}
