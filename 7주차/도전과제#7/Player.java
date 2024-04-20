package subject7_3;

public class Player {
	private int sumScore;
	private int currentScore;
	private int goalScore;
	
	public Player(int goal) {
		this.sumScore = 0;
		this.currentScore = 0;
		this.goalScore = goal;
	}
	
	public void playing(PairOfDice dice, int max) {
		
	}
	
	public int getSum() {
		return sumScore;
	}
}
