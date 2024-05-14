package subject10_1;

public abstract class DiscountPolicy {
    protected double discountMoney; // 할인액
    protected int price; // 가격
    protected int count; // 구매 수량

    public DiscountPolicy(int price, int count){
        this.price = price;
        this.count = count;
    }

    public abstract void calcDiscount();

    public void printing(){
        System.out.println("가격이 " + getPrice() + "인 상품 " + getCount() + " 개 구매시 할인 금액: " + getDiscountMoney());
    }

    public double getDiscountMoney() {
        return this.discountMoney;
    }

    public void setDiscountMoney(double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
