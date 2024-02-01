package opeator;

public class CompareEx1 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true ot false 로 나옴
    // 문자 vs 문자열
    // '' vs ""
    // 'A' "A"

    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    // 문자열 비교는 eqals 사용
    System.out.println(str1.equals);
  }
}
