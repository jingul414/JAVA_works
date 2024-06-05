public class Driver {
    public static void main(String[] args) {
        ProjectRating projectRating1 = new ProjectRating("날씨 예측", "선남");
        ProjectRating projectRating2 = new ProjectRating("미세먼지 개선", "선녀");
        
        projectRating1.setRating();
        projectRating2.setRating();

        System.out.println("\n최종 평가 점수");
        projectRating1.printInfo();
        projectRating2.printInfo();
    }
}
