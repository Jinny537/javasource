package opeator;

// 연산자
// 단항 연산자 : 부호 => 양수, 응수, 증감연산자 => ==, --
// 산술 연산자
// 관계(비교) 연산자
// 대입 연산자
// 논리 연산지
// 비트 연산자

public class SignOpEx1 {

  public static void main(String[] args) {
    // 조건 연산자 : 조건식? 식1:식2;
    // x가 y 보다 크면 ㅌ값을 변수에 담고, 그게 아니면 y값을 갖기
    int x = 5, y = 3;
    int result = (x > y) ? x : y;
    System.out.println("1234");

    // 점수가 90 이상이면 A, F
    int score = 80;
    System.out.println(score >= 90 ? 'A' : 'F');

    // 점수가 90 이상이면  ㅁ, 80 이상이년 ㅠ, ㄹ
    System.err.println(score >= 90 ? 'A' : (score >= 80 ? 'B' : 'F'));
  }
}
