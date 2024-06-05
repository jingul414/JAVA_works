public class ProjectRating {
    private String projectName;
    private String submitterName;
    private RatingScore[] rating = new RatingScore[3];  //등급 3개를 배열로 선언

    public ProjectRating(String projectName, String submitterName) {
        this.projectName = projectName;
        this.submitterName = submitterName;
        rating[0] = new RatingScore("예술성", 30);
        rating[1] = new RatingScore("기술성", 40);
        rating[2] = new RatingScore("상업성", 30);
    }

    public void setRating() {
        System.out.println("\n" + projectName + "에 대한 평가 등급을 입력하세요.");
        for(int i = 0; i < rating.length; i++) {
            rating[i].setScore();
        }
    }

    public void printInfo(){
        int sum = 0;
        for(int i = 0; i < rating.length; i++) {
            sum += rating[i].getScore();
        }

        System.out.println(submitterName + "의 " + projectName + "평가 점수 = " + sum + "/100");
    }
}
