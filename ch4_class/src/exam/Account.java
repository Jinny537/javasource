package exam;

public class Account {

  // 계죄번호(110-11-12345), 계죄주 이름(홈길동), 잔액(100000)
  private String id;
  private String name;
  private int money;

  public Account() {}

  public Account(int id, String name, int money) {
    this.id = id;
    this.name = name;
    this.money = money;
  }
}
