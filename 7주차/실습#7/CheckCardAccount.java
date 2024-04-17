package subject7_1;

import java.util.Scanner;

public class CheckCardAccount {
	private String name_;
	private String account_;
	private String expireDate_;
	private int remain_;
	private Scanner sc = new Scanner(System.in);

	public CheckCardAccount(String name, String account, String expireDate) {
		this.name_ = name;
		this.account_ = account;
		this.expireDate_ = expireDate;
		this.remain_ = 0;
	}

	public boolean isRightPerson(String name, String account, String expireDate) {
		// 3가지가 전부 일치하면 true 반환, 아니면 false 반환
		return (this.name_.equals(name) && this.account_.equals(account) && this.expireDate_.equals(expireDate));
	}

	public void buying() {
		int price;
		String name;
		String account;
		String expireDate;

		System.out.println("상품을 구매한다.");
		System.out.print("청구 금액을 입력하세요: ");
		price = sc.nextInt();

		System.out.print("고객 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("계좌 번호를 입력하세요: ");
		account = sc.next();
		System.out.print("카드 만기연월을 입력하세요: ");
		expireDate = sc.next();
		if (isRightPerson(name, account, expireDate)) {
			System.out.println("신원 확인 성공");			
			if (price <= this.remain_) {
				remain_ -= price;
			} else {
				System.out.println("잔고 초과");
			} 
		} else {
			System.out.println("신원 확인 실패");
		}
	}

	public void deposit(int money) {
		if (money > 0) {
			System.out.println(money + "원을 입금한다.");
			this.remain_ += money;
		}
	}

	public void withdraw(int money) {
		if(money < 0) return;
		
		if (money <= this.remain_) {
			remain_ -= money;
			System.out.println(money + "원을 출금한다.");
		} else {
			System.out.println("잔고 초과");
		} 
	}

	public void stat() {
		System.out.println("\n예금주 이름: " + getName());
		System.out.println("계좌번호: " + getAccount());
		System.out.println("만기연월: " + getExpireDate());
		System.out.println("잔고: " + getRemain());
	}
	
	public String getName() {
		return this.name_;
	}

	public String getAccount() {
		return this.account_;
	}

	public String getExpireDate() {
		return this.expireDate_;
	}

	public int getRemain() {
		return this.remain_;
	}
}
