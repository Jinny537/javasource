package poly;

public class Employee {

  private String name;
  private String position;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void work() {
    System.out.println(name + " 이(가)말한다.");
  }
}
