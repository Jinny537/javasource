package exam;

public class Pencil {

  public static void main(String[] args) {
    // 534개의 연필을 30명의 학생들에게 똑같은 갯수로
    // 나눌때 학생 한 명 당 몇 개를 가질수 있고, 최종적으로 몇개가 남는지 출력하시오
    // 변수 사용
    int pencils = 534;
    int students = 30;

    System.out.println("학생 한명 당 " + pencils / 30);
    System.out.println("남은 연필 수 " + pencils % 30);
  }
}
