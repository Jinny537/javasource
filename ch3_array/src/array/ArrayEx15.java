package array;

public class ArrayEx15 {

  public static void main(String[] args) {
    int[][] score = {
      { 100, 95, 98 },
      { 20, 20, 18 },
      { 30, 30, 38 },
      { 40, 55, 45 },
      { 50, 48, 67 },
    };
    // 학샹들의 점수 총점과 평균 출력
    // 번호  국어  영어  수학  총점  평균
    //  1    100    95    98   293    97

    int kortotal = 0, emgTotal = 0, mathTotal = 0;

    System.out.println("번호  국어  영어  수학  총점  평균");
    System.out.println("===============================================");

    for (int i = 0; i < score.length; i++) {
      System.out.printf("%d", (i + 1));

      korTotal += score[i][j];

      int sum = 0;
      float avg = 0.0f;

      for (int j = 0; j < score[1].length; j++) {
        sum += score[i][j];
        System.out.printf("%5d", score[i][j]);
      }
      avg = sum / (float) score[1].length;
      System.out.printf("%5d %5.1f\n", sum, avg);
    }
  }
}
