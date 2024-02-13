package InterfaceTest;

// interface
// 모든 멤버 변수는 pubilc static final 이어야 함
// 모든 멤버 메소드는 pubilc absttract 임(absttract 생략 가능)
// 추상화가 높은 상태(기본 설계도)
// body 를 가진 메소드는 static, default 만 가능(1.8 버전에서 추가된 기능)
// 여러 개 구현 가능
// public class Bouns implements Account, CheckingAccount
// public class Bouns extends CreditLine  implements Account, CheckingAccount

public interface Account {
  // accountNo; only public, static & final
  // private String accountNo; 멤버변수 선언 불가

  public static final int SPADE = 4; // 상수

  // Abstrct methods do not specify a body
  public void deposit();

  // 앞에 static, default가 붙어있으면 가능
  static void getCardKind() {}

  default void getCard() {}
}
