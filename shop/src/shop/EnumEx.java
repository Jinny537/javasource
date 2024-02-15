package shop;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumEx {

  public static void main(String[] args) {
    Week today = null;

    // 오늘 날짜 가져오기
    LocalDate now = LocalDate.now();

    // 오늘 날짜에 맞는 숫자 리턴(1(원요일) ~ 7(일요일))
    DayOfWeek week = now.geTDayOfWeek();

    switch (week) {
      case value:
        break;
      default:
        break;
    }
  }
}
