package exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성
    Calc calc = new Calc();

    int result = calc.add(15, 30);

    System.out.println("덧셈 결과 " + result);

    System.out.println("곱셈 결과 " + calc.multiply(3, 5));

    // 나눗셈
    System.out.println("나눗셈 결과 " + calc.divide(20, 4));
  }
}
