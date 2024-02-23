package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// java,util.function 패키지
// 함수형 인터페이스 제공

// 메소드
// 매게변수 없고, 반환값도 없음 : void run(); ==> java.lang.Runnable
// 매게변수 없고, 반환값 있음 : int run(); ==> Supplier<T> T get()
// 매게변수 있고, 반환값 없음 : void run(int a); ==> Consumer<T> void accept(T t)
// 매게변수 있고, 반환값 있음 : int run(int a); ==> Function<T,R> R Apply(T t)
//  조건식 표현 할 때 사용되는 메소드 : boolean test (int a); Predicate<T> ==> boolean test(T t)

// void (int a, String str)
// b1 ~~ : 매개변수의 개수가 2개인 합수형 인터페이스
// void(int a, String str) ==> Biconsumer<T,U> void accep(T t, U u)
// int run(String a, float f) ==> Bifunction<T,U,R> R Apply(T t, U u)
// boolean test(int a, double d) ==> BiPredicate<T,U> boolean test(T t, U u)

// Function 과 같은 역할
// 매개변수 타입과 반환 타입이 모두 일치한다
// UnaryOperator<T>  R apply<T t>
// BinaryOperator<T>  R apply<T t, T u>

// 기본형을 이용하는 함수형 인터페이스
// ToIntFunction  => int applyAsInt(T value)

public class LambdaEx3 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
    System.out.println("1~100 임의의 수 " + s.get());

    Consumer<Integer> c = i -> System.out.println(i);
    c.accept(10);

    Function<Integer, Integer> f = i -> i / 10 * 10;
    System.out.println(f.apply(10));

    Predicate<Integer> p = i -> i % 2 == 0;
    System.out.println(p.test(10));

    // "5698" 5698 + 30 ==> 5728 리턴
    Function<String, Integer> f2 = s1 -> Integer.parseInt(s1);
    System.out.println(f2.apply("5698") + 30);

    // 문자열의 길이가 0 인지 판별
    Predicate<String> p2 = s2 -> s2.length() == 0;
    System.out.println(p2.test("문자열"));

    // 문자열 리턴
    Supplier<String> supplier = () -> "안녕하세요.";
    System.out.println(supplier.get());

    //문자열을 받아서 문자열 출력
    Consumer<String> consumer = c1 -> System.out.println(c1);
    consumer.accept("반갑습나다.");

    // 두개의 숫자를 받아서 더하기 한 후 리턴
    BiFunction<Integer, Integer, Integer> function = (x, y) -> x + y;
    System.out.println(function.apply(50, 75));

    // 두개의 숫자를 받아서 큰 값 출력하기
    BiConsumer<Integer, Integer> consumer2 = (num1, num2) ->
      System.out.println(num1 > num2 ? num1 : num2);
    consumer2.accept(10, 8);

    // 두 개의 String 을 받아서 하나의 문자열로 리턴
    BiFunction<String, String, String> function2 = (str1, str2) ->
      str1.concat(str2);
    System.out.println(function2.apply("Hello", " World"));
  }
}
