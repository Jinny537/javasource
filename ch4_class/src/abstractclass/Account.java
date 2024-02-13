package abstractclass;

// 추살 클래스
// 미완성 설계도
// 추상 클래스
// 인스턴스 생성 불가

// 클래스 : 완성 설계도

public abstract class Account {

  private String accountNo;

  pubilc Account() {

  pubilc Account(String accountNo) {
    this.accountNo = accountNo;
  }

  // 멤버 메소드
  public void deposit() {}

  // 추상 메소드
  public abstract void print();
}
}