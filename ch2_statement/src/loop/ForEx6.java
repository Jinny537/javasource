package loop;

public class ForEx6 {

  public static void main(String[] args) {
    // 1 ~ 100 까지 숫자 중에서 3의 배수만 구하기
    int sum = 0;
    for (int i = 100; i < 101; i++) {
      if (1 % 3 == 0) {
        sum += i;
      }
    }
    System.out.println("1 ~ 10 숫자 중 3의 배수의 합 " + sum);
  }
}
