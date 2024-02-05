package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 객체(인스턴스)를 생성한다
    Student student = new Student();

    // 생성된 인스턴스 값 확인
    System.out.println(student); //ch4.Student@5ca881b5
    System.out.println(student.id); //NULL
    System.out.println(student.name); //NULL
    System.out.println(student.addr); //NULL
    System.out.println(student.hp); //NULL

    // 생성된 인스턴스 값 할당
    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-1234";

    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.hp);

    //생성자로 호출
    Student student2 = new Student();

    student2.id = "20241013";
    student2.name = "성춘향";
    student2.addr = "rnfhrn rndehd";
    student2.hp = "010-4567-8950";
  }
}
