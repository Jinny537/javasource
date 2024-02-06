package ch4;

// 시, 분, 초는 모두 0보다 크거나 같이야 한다
// 시의 범위는 0~23, 분, 초의 범위는 0~59
public class Time {

  // 멤버 변수, 속성, 필드, 인스턴스 변수
  private int hour;
  private int minute;
  private float second;

  // 클래스 변수
  private static String max;

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수들 : 지역변수
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}
