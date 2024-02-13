package InterfaceTest;

public class DateEx {

  public static void main(String[] args) {
    // DateAccessObject obj = new Oracle();
    // dbWork(obj);
    // obj = new Mysql();
    // dbWork(obj);
    dbWork(new Oracle());
    dbWork(new Mysql());

    // 익명 클래스 : 일회용 클래스(선언과 생성 동시에)
    DateAccessObject object = new DateAccessObject() {
      @Override
      public void select() {
        System.out.println("PostgreSQL 검색");
      }

      @Override
      public void insert() {
        System.out.println("PostgreSQL 삽입");
      }

      @Override
      public void update() {
        System.out.println("PostgreSQL 수정");
      }

      @Override
      public void delete() {
        System.out.println("PostgreSQL 삭제");
      }
    };

    dbWork(object);
  }

  public static void dbWork(DateAccessObject dao) {
    dao.select(); // Oracle DB 에서 검색 or Mysql DB 에서 검색
    dao.insert(); // Oracle DB 에서 삽입 or Mysql DB 에서 삽입
    dao.update(); // Oracle DB 에서 수정 or Mysql DB 에서 수정
    dao.delete(); // Oracle DB 에서 삭제 or Mysql DB 에서 삭제
  }
}
