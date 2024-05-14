package subject10_1;

public class Driver {
    public static void main(String[] args) {
        System.out.println("대량 구매시 할인금액");
        System.out.println("10개 이상 구매시 20% 할인");
        DiscountPolicy[] bulks = new DiscountPolicy[2];
        bulks[0] = new BulkDiscount(5, 10, 10, 20);
        bulks[1] = new BulkDiscount(3, 15, 10, 20);
        for(int i = 0; i < 2; i++){
            bulks[i].calcDiscount();
            bulks[i].printing();
        }

        System.out.println("");

        DiscountPolicy[] plusOne = new DiscountPolicy[5];
        System.out.println("한 상품을 3개 사면 그 중 1개를 공짜로 주는 경우 할인 금액");
        for(int i = 0; i < 5; i++){
            plusOne[i] = new BuyNItemsGetOneFree(5, 2+i, 3);
            plusOne[i].calcDiscount();
            plusOne[i].printing();
        }
    }
}
