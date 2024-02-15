package shop;

public abstract class Product {

  private String pname;

  private int price;

  public void printDetail() {
    System.out.println("제품명 : " + pname);
    System.out.println("가격 : " + price);
    printExtra();
  }

  abstract void printExtra();

  public char[] getPname() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPname'");
  }
}
