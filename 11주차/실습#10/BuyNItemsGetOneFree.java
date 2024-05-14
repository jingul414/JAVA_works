package subject10_1;

public class BuyNItemsGetOneFree extends DiscountPolicy{
    private int freeCount; // 공짜로 받을 수 있는 최소 개수

    public BuyNItemsGetOneFree(int price, int count, int freeCount){ 
        super(price, count);
        this.freeCount = freeCount;
    }

    @Override
    public void calcDiscount() {
        discountMoney = (count / freeCount) * price; 
    }

    public int getFreeCount() {
        return this.freeCount;
    }

    public void setFreeCount(int freeCount) {
        this.freeCount = freeCount;
    }
}
