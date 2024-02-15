package shop;

public class CellPhone extends Product {

  private String carrier;

  public CellPhone(String string, int i, String string2) {
    //TODO Auto-generated constructor stub
  }

  @Override
  public void printExtra() {
    System.out.println("통신사 : " + carrier);
  }
}
