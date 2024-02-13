package exam2;

public class ColorTv extends Tv {

  private int color;

  public ColorTv(int size, int color) {
    super(size);
    this.color = color;
  }

  public int getColor() {
    return color;
  }

  public void printproperty() {
    System.out.println("Size: " + getsize() + " 인치");
    System.out.println("Color: " + color + " 컬러");
  }
}
