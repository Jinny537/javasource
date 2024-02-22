package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// java.time.LocalDate : 날짜
// java.time.Loca;Time : 시간
// java.time.LocalDateTime : 날따/시간
public class LocalDateEx2 {

  public static void main(String[] args) {
    //오늘 날짜
    LocalDate today = LocalDate.now();
    // 현재 시간
    LocalTime now = LocalTime.now();

    System.out.println(now);
    System.out.println(today);

    // 특정 날짜 지정
    LocalDate birth = LocalDate.of(1950, 11, 23);
    LocalTime birthTime = LocalTime.of(23, 11, 58);

    // 날짜 덧셈
    System.out.println(birth.plusDays(1));
    System.out.println(birth.minusDays(3));

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);
    System.out.println(date.getHour());
    System.out.println(date.getMinute());
    System.out.println(date.getSecond());
    System.out.println(date.getYear());
    System.out.println(date.getMonth());
    System.out.println(date.getDayOfMonth());
  }
}
