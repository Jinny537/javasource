package exam;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    // 숫자 세 개를 입력받은 후 가장 큰 숫자 출력
    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 숫자 >>>");
    int num1 = sc.nextInt();
    System.out.println("두번째 숫자 >>>");
    int num2 = sc.nextInt();
    System.out.println("세번째 숫자 >>>");
    int num3 = sc.nextInt();

    int max = num1;

    if (max < num2) {
      max = num2;
    }
    if (max < num3) {
      max = num3;
    }
    System.out.println(max);
  }
}
