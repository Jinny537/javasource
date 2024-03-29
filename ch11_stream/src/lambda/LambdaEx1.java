package lambda;

public class LambdaEx1 {

  public static void main(String[] args) {
    // Myfunction1 사용
    MyFunstion1 lambda1 = () -> {
      System.out.println("함수적 인터페이스");
    };
    lambda1.method();

    MyFunstion1 lambda2 = () -> {
      int i = 10;
      System.out.println(i * i);
    };
    lambda2.method();

    MyFunstion2 lambda3 = x -> System.out.println(x);
    lambda3.method(10);

    lambda3 = x -> System.out.println(x * x);
    lambda3.method(100);

    MyFunstion3 lambda4 = (x, y) -> x > y ? x : y;
    System.out.println(lambda4.method(10, 15));
  }
}
