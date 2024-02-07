package exam;

import ch4.Student3;
import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    // Account 객체를 담을 배열 생성 3개
    Account acc[] = new Account[3];

    // 입력
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < acc.length; i++) {
      System.out.print("계좌번호 >> ");
      String id = sc.nextLine();
      System.out.print("계좌주 >> ");
      String name = sc.nextLine();
      System.out.print("잔액 >> ");
      int money = Integer.parseInt(sc.nextLine());

      acc[i] = new Account(id, name, money);
    }

    // 확인
    for (Account account : acc) {
      System.out.println(account);
    }
  }
}
