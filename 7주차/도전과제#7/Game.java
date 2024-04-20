package subject7_3;

public class Game {
	private PairOfDice dice;
	private int goal;
	private Player com;
	private Player per;
	private Player currentPlayer;
	
	public Game(int goal) {
		this.goal = goal;
		dice = new PairOfDice();
		com = new Player(20);
		per = new Player(-1);
	}
	
	public void playGame() {
		
	}
}
