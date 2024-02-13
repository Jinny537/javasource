package exam2;

public class IpTv extends ColorTv {

  private String ip;

  public IpTv(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  @Override
  public void printproperty() {
    System.out.println(
      "나의 IpTv는 " +
      ip +
      " 주소의 " +
      getsize() +
      "인치 " +
      getColor() +
      "컬러"
    );
  }
}
