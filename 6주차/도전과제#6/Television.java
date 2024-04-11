package subject6_3;

import java.util.Scanner;

public class Television {
	String brandName_;
	boolean powerOn_ = false;
	int chNum_ = 1;
	int volume_ = 0;
	Scanner sc = new Scanner(System.in);
	public String getBrandName_() {
		return brandName_;
	}
	public boolean isPowerOn_() {
		return powerOn_;
	}
	public int getChNum_() {
		return chNum_;
	}
	public int getVolume_() {
		return volume_;
	}
	public void setBrandName_(String brandName) {
		this.brandName_ = brandName;
	}
	public void setPower(boolean powerOn) {
		this.powerOn_ = powerOn;
	}

	public void setChNum_(int ch) {
		while(ch < 1 || ch > 99){
			System.out.println("오류: 새 채널 번호는 유효한 범위 안에 있어야 한다");
			return;
		}
		
		if(isPowerOn_()) this.chNum_ = ch;
	}
	
	public void chNumPlus() {
		if(1 <= this.chNum_ && this.chNum_ <= 99){
			if(this.chNum_ == 99) {
				this.chNum_ = 1;
				return;
			}
			this.chNum_ ++;
		}else {
			System.out.println("오류: 새 채널 번호는 유효한 범위 안에 있어야 한다");
		}
	}
	
	public void chNumMinus() {
		if(1 <= this.chNum_  && this.chNum_ <= 99){
			this.chNum_ --;
			if(this.chNum_ == 1) this.chNum_ = 99;
		}else {
			System.out.println("오류: 새 채널 번호는 유효한 범위 안에 있어야 한다");
		}
	}
	
	public void setVolume_(int vol) {
		this.volume_ = vol;
	}
	
	public void minusVolume_() {
		if(this.volume_ != 0) this.volume_ --;

	}
	
	public void plusVolume_() {
		if(this.volume_ != 12) this.volume_ ++;
	}
	
	public void outputData() {
		System.out.println("브랜드: " + getBrandName_());
		
		System.out.print("전원: ");
		if(isPowerOn_()) System.out.println("on");
		else System.out.println("off");
		
		System.out.println("채널번호: " + getChNum_());
		
		System.out.println("볼륨: " + getVolume_() + "\n");
	}
}
