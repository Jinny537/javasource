package exception;

// 사용자 정의 예시
public class BalanceInsufficcientException extends Exception {

  public BalanceInsufficcientException() {
    super();
  }

  public BalanceInsufficcientException(String message) {
    super(message);
  }
}
