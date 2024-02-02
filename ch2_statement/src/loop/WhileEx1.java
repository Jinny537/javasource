package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    // //System.out.println(1);
    // sum += i; //sum = sum + i;
    // }
    int i = 1;
    while (i <= 10) {
      sum += i;
      sum = sum + i;
    }
    System.out.println("1 ~ 10 까지의 합 " + sum);
  }
}
