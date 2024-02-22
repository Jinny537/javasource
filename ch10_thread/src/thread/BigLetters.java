package thread;

// thread(쓰레드)
// 프로세스 : 실행 중인 프로그램(OS 로부터 실행에 필요한  자원(메모리) 할당받아 실행)
// 프로세스 : 프로그램을 수행하는데 필요한 데이터 + 자원 + 쓰레드(실제로 작업을 수행)
// 모든 프로세스는 최소헌 하나 이상의 쓰레드가 존재 => 둘 이상의 쓰레드를 가진 프러세스가 멀티 쓰레드

// 멀티 쓰레드 구현
// 1) Runnable 구현하는 클래스 작성
//     run() 오버라이딩
// 2) Thread 상속받는 클래스 작성
// 3) stop(). Interrupt

// 동기화 : 한 스레드가 진핼중인 다른 쓰ㅔ드가 간ㅅㅂ하지 몽하도록 막는 것
//

public class BigLetters {

  public static void main(String[] args) {
    Thread t = new Thread(new SmallLetters());
    t.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.println(ch + " ");
    }
  }
}
