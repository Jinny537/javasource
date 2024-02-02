package exam;

public class PrimeNumebr {

  public static void main(String[] args) {
    // 1~100 숫자중에서 소수 찾아서 출력, 소수의 갯수 출력
    // 소수 : 1보다 큰 자연수 중에서 1과 자기자신만을 야수로 가지는 수
    // 2,3,5,7,11,13,17.....

    int count = 0, total = 0;
    for (int i = 2; i < 101; i++) {
      for (int j = 1; j <= i; j++) {
        if (1 % j == 0) {
          // 나누어 떨어지는 숫자 세기
          count++;
        }
      }
      if (count == 2) {
        System.out.print(i + "\t");
        total++;
      }
      count = 0;
    }
    System.out.println();
    System.out.println("1~100 소수의 갯수는 " + total);
  }
}
