package subject_c;

import java.util.Scanner;

public class Game {
	private PairOfDice dice;		//주사위를 가르키는 변수
	private int goal;				//목표 점수
	private Player com;				//컴퓨터 플레이어를 가르킴
	private Player per;				//유저 플레이어를 가르킴
	private Player currentPlayer;	//현재 플레이어를 가르킴
	private Scanner sc = new Scanner(System.in);

	public Game(int goal) {
		this.goal = goal;
		dice = new PairOfDice();
		com = new Player(20);
		per = new Player(-1);
	}

	public void printScore() {
		System.out.println("현 점수: ");
		System.out.println("  컴퓨터: " + com.getSum());
		System.out.println("  사용자: " + per.getSum());
	}
	
	public void playGame() {
		while (true) {
			currentPlayer = com;
			
			System.out.println("*********************");
			System.out.println("컴퓨터 차례...");
			currentPlayer.setCurrentScoreZero();
			
			//컴퓨터 차례에서는 규칙에 따라 게임을 하되, 현재 라운드에서 20점 이상을 얻으면 컴퓨터 라운드 종료
			do {
				printScore();
				dice.roll();
				currentPlayer.setCurrentScore(dice.getFirst_face() + dice.getSecond_face());
				printDice();
				if (currentPlayer.getCurrentScore() >= currentPlayer.getGoal()) {
					currentPlayer.setSum();
					break;
				}
			} while (currentPlayer.isReRoll(dice));
			if (currentPlayer.getSum() >= goal) break;


			currentPlayer = per;
			
			System.out.println("*********************");
			System.out.println("사용자 차례...");

			
			//유저 라운드에서는 라운드당 점수 제한 없이 규칙에 따라 계속 반복
			currentPlayer.setCurrentScoreZero();
			printScore();
			dice.roll();
			currentPlayer.setCurrentScore(dice.getFirst_face() + dice.getSecond_face());
			printDice();

			while (currentPlayer.isReRoll(dice)) {
				System.out.print("계속 던지시겠습니까: ");
				String tmp = sc.next();
				if (!tmp.equals("y")) {
					currentPlayer.setSum();
					break;
				}
				printScore();
				dice.roll();
				currentPlayer.setCurrentScore(dice.getFirst_face() + dice.getSecond_face());
				printDice();
			}
			if (currentPlayer.getSum() >= goal) break;

		}
	}

	public void printDice() {
		int tmp = currentPlayer.getCurrentScore();
		System.out.println("DICE: " + dice.getFirst_face() + " + " + dice.getSecond_face() + " = " + (int)(dice.getFirst_face() + dice.getSecond_face()) );
		System.out.println("현 회차 점수: " + tmp + "\n");

	}

	public void printWinner() {
		System.out.println("축하합니다. ");
		if (currentPlayer == com)
			System.out.println("컴퓨터가 이겼습니다!!");
		else
			System.out.println("사용자가 이겼습니다!!");
		System.out.println("최종 결과");
		System.out.println("  컴퓨터 점수: " + com.getSum());
		System.out.println("  사용자 점수: " + per.getSum());
	}
}
