package subject10_1;

public class BulkDiscount extends DiscountPolicy{
    private int minimumCount; // 최소 갯수
    private double discountRate; // 할인율

    public BulkDiscount(int price, int count, int minimumCount, double discountRate) {
        super(price, count);
        this.minimumCount = minimumCount;
        this.discountRate = discountRate;
    }

    @Override
    public void calcDiscount() {
        if(count >= minimumCount){
            discountMoney = count * price * discountRate / 100;
        }
    }

    public int getMinimumCount() {
        return this.minimumCount;
    }

    public void setMinimumCount(int minimumCount) {
        this.minimumCount = minimumCount;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
