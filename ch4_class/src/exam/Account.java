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
  public int deposit(int amount) {
    money = money + amount;
    return money;
  }

  // 출금하다
  // withdraw
  public int withdraw(int amount) {
    money = money - amount;
    return money;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
}
