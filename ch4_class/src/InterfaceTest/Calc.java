package InterfaceTest;

public interface Calc {
  // pubilc static final  기본
  double PI = 3.14;
  int ERROR = -99999999;

  // public
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int idvide(int num1, int num2);
}
