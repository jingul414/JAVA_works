import java.util.Scanner;

public class RatingScore {
    private String name;
    private int maxScore;
    private int score;

    public RatingScore(String name, int maxScore){
        this.name = name;
        this.maxScore = maxScore;
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.name + "에 대한 당신의 평가 등급은?");
        System.out.print("1부터 " + this.maxScore + "까지의 한 정수를 입력하세요: ");
        int tmp = sc.nextInt();
        while(!(1 <= tmp) || !(tmp < maxScore)){
            System.out.println("평가 등급이 범위 밖입니다.");
            System.out.print("1부터 " + this.maxScore + "까지의 한 정수를 입력하세요: ");
            tmp = sc.nextInt();
        }
        this.score = tmp;
    }
}
