package ch4;

public class MymathEx {

  public static void main(String[] args) {
    Mymath mymath = new Mymath(15, 5);

    // non_static 메소드 호출
    System.out.println("add() " + math.add());
    System.out.println("subtract() " + math.subtract());
    System.out.println("multiply() " + math.multiply());
    System.out.println("divide() " + math.divide());

    System.out.println("static add() " + Mymath.add(300L, 200L));
    System.out.println("static subtract() " + Mymath.subtract(300L, 200L));
    System.out.println("static multiply() " + Mymath.multiply(300L, 200L));
    System.out.println("static divid() " + Mymath.divide(300L, 200L));
  }
}
