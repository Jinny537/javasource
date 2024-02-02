package exam;

public class Dicesum {

  public static void main(String[] args) {
    /* 주사위 2개를 굴려 나오는 숫자를 (숫자1,숫자2) 형태로 출력
     * 주사위 합이 5 일때 중단
     *
     */
    while (true) {
      // 주사위를 굴려서 그 주사위의 눈이 6이 나왔을 때 반복문 종료
      int dice1 = (int) (Math.random() * 6) + 1;
      int dice2 = (int) (Math.random() * 6) + 1;
      System.out.printf("(%d, %d)\n", dice1, dice2);
      if (dice1 + dice2 == 5) break;
    }
  }
}
