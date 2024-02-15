package exception;

public class Account {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  // new Exception() : 컴파일 예외
  // new RuntimeException() : 런타임 예외
  public void withdraw(int money) throws BalanceInsufficcientException {
    if (balance < money) {
      throw new BalanceInsufficcientException("잔액 부족");
    }
  }
}
