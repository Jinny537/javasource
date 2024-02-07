package ch4;

public class TvEx2 {

  public static void main(String[] args) {
    // Tv 인스턴스 3개 생성
    // Tv tv = new Tv("black", 3, false);
    // Tv tv2 = new Tv("white", 5, false);
    // Tv tv3 = new Tv("gray", 4, false);

    Tv tvarr[] = new Tv[3]; // int arr[] = new int[3];
    tvarr[0] = new Tv("black", 3, false); // arr[0] = 10
    tvarr[1] = new Tv("white", 5, false);
    tvarr[2] = new Tv("gray", 4, false);

    // int arr[] = {10,12,13};
    TV tvarr2[] = {
      new Tv("black", 3, false),
      new Tv("white", 5, false),
      new Tv("gray", 4, false),
    };

    // 첫번째 tv 전원 켜기
    // tv.setPower(true);
    // tv.setChannel(15);
    tvarr[0].setPower(true);
    tvarr[0].setChannel(15);
    // 3번째 tv
    // tv2.setPower(true);
    // tv2.setChannel(20);

    tvarr[1].setPower(true);

    tvarr[1].setChannel(20);
  }
}
