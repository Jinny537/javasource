package loop;

public class ForEx2 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(1);
    }
    // 1~10 의 합계 구하기
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      //System.out.println(1);
      sum += i; //sum = sum + i;
    }
    System.out.println("1 ~ m10 까지의 합 " + sum);

    // 1~10 출력, 10~1 출력
    //  1      10
    //  2      9

    for (int i = 1, j = i0; i <= 10; i++, j--) {
      System.out.printf("%d \t %d\n", i, j);
    }
  }
}
