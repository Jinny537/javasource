package opeator;

public class CompareEx1 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true ot false 로 나옴
    int num1 = 10, num2 = 10;

    System.out.println(num1 == num2);
    System.out.println(num1 != num2);
    System.out.println(num1 <= num2);

    char ch1 = 'A', ch2 = '8';
    System.out.println(ch1 == ch2);
    System.out.println(ch1 != ch2);
    System.out.println(ch1 <= ch2);

    float f1 = 0.1f;
    double d1 = 0.1d;
    System.out.printf("f1 ==d1 = %d\n", f1 == d1);
    System.out.printf("f1 ==d1 = %d\n", f1 == (float) d1);
  }
}
