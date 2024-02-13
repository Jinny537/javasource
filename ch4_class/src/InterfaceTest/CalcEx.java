package InterfaceTest;

public class CalcEx {

  public static void main(String[] args) {

    // 참조변수가 사용할수 있는 범위 제한
    CompleteCalc calc new CompleteCalc();
    System.out.println("clac add " + clac.add(10,2));
    System.out.println("clac divide " + clac.divide(15,5));
    System.out.println("clac subtrsct " + clac.subtrsct(25,10));
    System.out.println("clac times " + clac.times(3,5));
    calc.showInfo();
    

    Calculator clac2 new CompleteCalc();
    System.out.println("clac add " + clac2.add(10,2));
    System.out.println("clac divide " + clac2.divide(15,5));
    System.out.println("clac subtrsct " + clac2.subtrsctd(25,10));
    System.out.println("clac times " + clac2.times(3,5));
    // calc2.showInfo();

    Calc clac3 new CompleteCalc();
    System.out.println("clac add " + clac3.add(10,2));
    System.out.println("clac divide " + clac3.divide(15,5));
    System.out.println("clac subtrsct " + clac3.subtrsct(25,10));
    System.out.println("clac times " + clac3.times(3,5));
    // calc3.showInfo();
  }
}
