package exam;

import java.util.Scanner;

public class PayOfhours {

  public static void main(String[] args) {
    // 근무 시간 입력 받은 후
    // 사간 당 9800
    // 8시간이 넘어가는 시간은 원래 받는 시간의 1.5%
    // 오늘 받은 임금은 150000

    Scanner sc = new Scanner(System.in);

    System.out.println("근무시간 입력");
    int hour = sc.nextInt();
    
    int pay = 0, rate = 9800;
    if (hour > 8) {
        pay = hour
    }
    
  }
}
