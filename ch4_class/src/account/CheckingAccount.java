package account;

// 은행 + 체크카드
public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo;
  }

  // pay(String caedNo, int amount)
  // cardNo 가 일치하는지 확인, 사용금액이 잔애보다 적은지 확인
  // 일치하지 않으면 지불 불가
  // 일치한다면, 금액이 적으면 잔액-사용금액
  void pay(String cardNo, int amount) throws Exception {
    if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
      throw new Exception("지불 불가");
    }

    // 잔액 = 잔액 - 사용액
    // setBalance(getBalance() - amount);
    withdraw(amount);
  }
}
