package ch4;

public class TvEx {

  public static void main(String[] args) {
    // 생성자 호풀
    Tv tv = new Tv("black", 3, true);

    // Tv tv = new Tv();
    // System.out.println(tv.color); // NULL
    // System.out.println(tv.channel); // 0
    // System.out.println(tv.power); // fales

    // tv.color = "black";
    // tv.channel = 3;
    // tv.power = true; // true => on

    tv.channe1Up();
    System.out.println("현재 채널 " + tv.getChannel());

    // 채널 번호 직접 변경
    tv.setChannel(34);
    System.out.println("현재 체널 " + tv.getChannel());

    // 전원 끄기
    tv.setPower(false);
    System.out.println("전원 " + tv.isPower());
  }
}
