package ch4;

public class TvEx {

  public static void main(String[] args) {
    Tv tv = new Tv();
    System.out.println(tv.color); // NULL
    System.out.println(tv.channel); // 0
    System.out.println(tv.power); // fales

    tv.color = "black";
    tv.channel = 3;
    tv.power = true; // true => on

    tv.channe1Up();
    System.out.println("현재 채널 " + tv.channel);
    // 채널 번호 직접 변경
  }
}
