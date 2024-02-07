package ch4;

public final class Person {

  // 멤버변수에 final이 붙은 경우
  // 초기회(선언 or 생성자) 반드시 해야함
  // 수정 불가
  // 상수 개념

  // 클래스에 final이 붙은 경우 - 상속 금지
  // 메소드에 final이 붙은 경우 - 오버라이딩 금지

  private String name;
  private final String nation;

  // 객체끼리 고유하는 상수
  // 상수는 대문자로 표현
  // private static final double PT = 3.141592;
  private static final double PI = 3.141592;

  public static double getPI() {
    return PI;
  }

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
