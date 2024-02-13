package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("홍길동", "사원");
    work(employee);

    // employee = new Ceo("김유신", "회장");
    // employee.work();
    Ceo ceo = new Ceo("김유신", "회장");
    // ceo.work();
    work(ceo);

    // employee = new Admin("김동호", "관리자");
    // employee.work();
    Admin admin = new Admin("김동호", "관리자");
    // admin.work();
    work(admin);

    // employee = new PartTime("정우성", "이르바이트");
    // employee.work();
    PartTime partTime = new PartTime("정우성", "이르바이트");
    // partTime.work();
    work(partTime);
  }

  // public static void work(Employee employee){
  //     employee.work;

  // }

  public static void work(Admin employee) {
    employee.work;
  }
}
