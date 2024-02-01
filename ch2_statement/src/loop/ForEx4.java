package loop;

public class ForEx4 {

  public static void main(String[] args) {
    // 5행  10열의 별(*)
    // **********
    // **********
    // **********
    // **********
    // **********

    // 1) int 9 = 1;
    // 2) 1 < 6;
    // 3) int j = i;
    // 4) j < 11
    // 5) system.out.prnt("*")
    // 6) j++
    // 7)
    // 8)
    // 9)
    // 10) j == 11 안쪽, jor 문 종료
    // 11) 뇬ㅅ드.ㅐㅕㅅ.ㅔ갸ㅜ샤ㅜ();
    // 12) 바깥쪽 for i+++
    // 13) i < 6
    // 14) 안쪽 랙 10번 수행
    // 바깥쪽 for

    for (int j = 1; j < 11; j++) {
      System.out.print("*");
    }

    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 11; j++) {
        System.out.println("*");
      }

      System.out.println();
    }
  }
}
