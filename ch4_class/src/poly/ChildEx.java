package poly;

// 다형성(Polrmorp[hism])
// 부모 클래스 타입의 참조 변수로 자손 클래스의 인스턴스 참조
// 형변환 :  자손 타입 -> 조상타입 (저동 형변환)
//           조상 타입 -> 저손 타입 (강제 형변환)
//         참변수의 타입을 변환하는 것으로 참조할수 있는 범위를 조정하는 개념

public class ChildEx {

  public static void main(String[] args) {
    Child child = new Child();
    // Child로 접근 가능한 범위
    // field1, method1(), method2(), field2, method3()

    // 상속 관계라면
    Parent child1 = new Child();
    // Child1로 접근 가능한 범위
    // field1, method(), method2() => 부모꺼
    child1.method2(); // 오버라이딩 된 메소드라면 자식 메소드가 실행
  }
}
