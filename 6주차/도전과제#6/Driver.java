package subject6_3;

public class Driver {

	public static void main(String[] args) {
		Television tv1 = new Television();
		tv1.setBrandName_("삼성");
		tv1.setPower(true);
		tv1.setChNum_(1);
		tv1.setVolume_(6);
		tv1.outputData();
		
		Television tv2 = new Television();
		tv2.setBrandName_("엘지");
		tv2.setPower(true);
		tv2.setChNum_(98);
		tv2.setVolume_(12);
		tv2.outputData();
		tv2.chNumPlus();
		tv2.plusVolume_();
		tv2.outputData();
		
	}

}
