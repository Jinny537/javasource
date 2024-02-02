package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int balance = 0;

    while (run) {
      System.out.println("---------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("---------------------------------");
      System.out.print("메뉴 선택 >> ");

      int menu = sc.nextInt();

      switch (menu) {
        case 1:
          System.out.println("예금액 : ");
          balance += sc.nextInt();
          // 예금액 입려갇은 후 잔액 추가
          break;
        case 2:
          System.out.println("출금액 : ");
          balance += sc.nextInt();
          // 출금액 받은 후 잔액 감소
          break;
        case 3:
          System.out.println("잔액액 : " + balance);
          // 잔액 표시
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
      }
    }
  }
}
