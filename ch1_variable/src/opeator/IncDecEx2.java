package opeator;

public class IncDecEx1 {

  // 단항 연산자 : 부호 =>양수, 음수, 증감연산자 => ++, --
  public static void main(String[] args) {
    int x = 10, y = 20;

    x++; // x=x; x=x+1
    y++; // y=y; y=y+1

    System.out.printf("x=%d, y=%d", x, y);

    x--; // x=x; x=x+1
    y--; // y=y; y=y+1

    System.out.printf("x=%d, y=%d", x, y);
  }
}
