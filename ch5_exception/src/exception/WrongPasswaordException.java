package exception;

public class WrongPasswaordException extends Exception {

  public WrongPasswaordException() {
    super();
  }

  public WrongPasswaordException(String message) {
    super(message);
  }
}
