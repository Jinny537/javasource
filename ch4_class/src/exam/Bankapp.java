package exam;

import java.util.Scanner;

public class Bankapp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "----------------------------------------------------------"
      );
      System.out.println(
        "1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료"
      );
      System.out.println(
        "----------------------------------------------------------"
      );
      System.out.println("메뉴 선택 >> ");

      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          run = false;
          System.out.println("종료");
          break;
      }
    }
  }

  static void createAccount() {
    System.out.print("계좌번호 >> ");
    String id = sc.nextLine();
    System.out.print("계좌주 >> ");
    String name = sc.nextLine();
    System.out.print("잔액 >> ");
    int money = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(id, name, money);
        System.out.println("계좌가 등록되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    // 생성된 계좌목록 보여주기
    for (Account account : accArr) {
      if (account != null) {
        System.out.println(account);
      }
    }
  }

  static void deposit() {
    // 예금하다
    // 계좌번호
    System.out.print("계좌번호 >> ");
    String id = sc.nextLine();
    // 예금액
    System.out.print("잔액 >> ");
    
    try {
        int money = Integer.parseInt(sc.nextLine());
  
        // 배열에서 입력받은 계좌번호와 일치한 배열번호 찾기
        Account account = findAccount(id);
  
        if (account != null) {
            System.out.println("현재잔액 : " + account.deposit(money));
        }
      }
   }


  static void withdraw() {
    // 출금하다
    // 계좌번호
    System.out.print("계좌번호 >> ");
    String id = sc.nextLine();
    // 예금액
    System.out.print("출금액 >> ");
    int money = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열번호 찾기
    Account account = findAccount(id);
          // 찾은 요쇼의 잔액 + 예금액
          if (account != null) {
            
          
          System.out.println("현재잔액 : " + account.withdraw(money));
          }
  }


  static Account findAccount(String id) {
    for (Account account : accArr) {
        if (account != null) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
    }
    return null;  // Return null if the account is not found
}
}

