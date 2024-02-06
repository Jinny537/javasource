package exam;

public class Account {

  // 계죄번호(110-11-12345), 계죄주 이름(홈길동), 잔액(100000)
  private String id;
  private String name;
  private int money;

  public Account() {}

  public Account(String id, String name, int money) {
    this.id = id;
    this.name = name;
    this.money = money;
  }

  // 예금하다
  // deposit
  int deposit(int amount) {
    money = money + amount;
    return money;
  }

  // 출금하다
  // withdraw
  int withdraw(int amount) {
    money = money - amount;
    return money;
  }
}
