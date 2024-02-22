package thread;

public class UserMain {

  public static void main(String[] args) {
    Calculator Calculator = new Calculator();

    Thread t1 = new User1(null);
    Thread t2 = new User2(null);

    t1.start();
    t2.start();
  }
}
