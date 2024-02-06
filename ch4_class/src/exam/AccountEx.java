package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-12345", "홍길동", 100000);

    // 예금 입금
    int money = account.deposit(20000);
    System.out.println("현재 잔액 " + money);
    // 예금 인출
    money = account.withdraw(130000);
    System.out.println("현재 잔액 " + money);
  }
}
