package subject_c;

import java.util.Random;

public class PairOfDice {
	private Random random = new Random();	//랜덤 정수를 생성할 변수
	private int first_face;					//첫번째 주사위의 면
	private int second_face;				//두번째 주사위의 면

	public PairOfDice() {
		this.first_face = 1;
		this.second_face = 1;
	}

	public void roll() {
		first_face = random.nextInt(5) + 1;
		second_face = random.nextInt(5) + 1;
	}

	public int getFirst_face() {
		return first_face;
	}

	public int getSecond_face() {
		return second_face;
	}
}
