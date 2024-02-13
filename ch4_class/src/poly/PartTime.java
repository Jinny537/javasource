package poly;

public class PartTime extends Employee {

  public PartTime(String string, String string2) {
    //TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    super(name, position);
  }

  @Override
  public void work() {
    System.out.println(
      super.getName() +
      " " +
      super.getPosition() +
      " 주어진 시간동안 일을 합니다."
    );
  }
}
