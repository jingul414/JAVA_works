package subject7_3;

import java.util.Random;

public class PairOfDice {
	private Random random = new Random();
	private int first_face;
	private int second_face;

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
