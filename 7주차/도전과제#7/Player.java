package subject_c;

public class Player {
	private int sumScore;		//지금까지의 합계 점수
	private int currentScore;	//현재 라운드의 점수
	private int goalScore;		//목표점수(컴퓨터가 도달하면 멈추게 하는 점수)
	
	public Player(int goal) {
		this.sumScore = 0;
		this.currentScore = 0;
		this.goalScore = goal;
	}
	
	public boolean isReRoll(PairOfDice dice) {
		//2개의 주사위중 1개만 1일경우
		if( (dice.getFirst_face() == 1 && dice.getSecond_face() != 1) || (dice.getFirst_face() != 1 && dice.getSecond_face() == 1) ) {
			currentScore = 0 ;
			sumScore += currentScore;
			System.out.println("꽝입니다!!!");
			return false;
		}else if(dice.getFirst_face() == 1 && dice.getSecond_face() == 1) {
		//2개의 주사위가 모두 1일 경우
			currentScore = 0;
			sumScore = 0;
			System.out.println("꽝입니다!!!");
			return false;
		}else {
		//모든 주사위가 1이 아닐경우
			return true;
		}
	}
	
	public int getGoal() {
		return goalScore;
	}
	
	public void setCurrentScore(int num) {
		this.currentScore += num;
	}
	
	public void setCurrentScoreZero() {
		this.currentScore = 0;
	}
	
	public int getCurrentScore() {
		return currentScore;
	}
	
	public void setSum() {
		this.sumScore += currentScore;
	}
	
	public int getSum() {
		return sumScore;
	}
}
