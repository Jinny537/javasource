package ch4;

public class FactorialEx {

  // f(n) = n * f(n-1) 단 f(1) = 1

  public static void main(String[] args) {
    System.out.println(Factorial(4));
  }

  // 재귀 호출 : 메서드 자신을 호출
  static int Factorial(int n) {
    int result = 0;

    if (n == 1) result = 1; else result = n * Factorial(n - 1);
    return result;
  }
}
