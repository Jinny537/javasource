package ch4;

// 멤버 변수 초기값
// Stirng : nnull
// int, iong : 0
// float, double : 0.0
// char : ' '
// boolean : fales

//클래스 : 설계도
// 객체 : 실제 사용

public class Tv {

  //색상(검정, 흰색), 전원 상태(on, off), 채널(6,7,..), 볼륨(13,14), 크기(50,46)...
  String color;
  int channel;
  boolean power;

  void channe1Up() {
    channel++;
  }

  void channe1down() {
    channel--;
  }
  // 생성자
  // Tv(){}
}
