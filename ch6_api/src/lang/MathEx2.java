package lang;

import static java.lang.Math.*;

// Math : b규성 요소가 모두 static 상태

public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    // 0 ~ 1 미만의 임의의 숫자
    System.out.println(Math.random());

    // round() : 반올림

    double va1 = 90.7552;
    System.out.println("round() " + Math.round(va1));
  }
}
