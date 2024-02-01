package loop;

/* 제어문 - 1) 조건문 2) 반복문
 * 
 */

public class ForEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int i = 0; 초기화(제일 차음만 실행)
            i < args.length;  조건식이(조건식이 참일 때까지만 반복)
            i++ (i=i+1) 증감식(반복문을 제어하는 변수의값을 증가 혹은 감소) 
        }
     //System.out.println("I can do it");
     //System.out.println("I can do it");
     //System.out.println("I can do it");
     //System.out.println("I can do it");
     //System.out.println("I can do it");
     //System.out.println("I can do it");

     // 1) int i = 0;
     // 2) i < 5;
     // 3) 반복문 안으로 진입 : syso 실행
     // 4) i++ => ㅑ=1
     // %) i < 5;
     // 6) 반복문 안으로 진입 : syso 실행
     // 7) i++ => i=2
     //   .............
     // 8) i++ => 5
     // 9) i < 5 조건이 fales가 되면 밤복문은 종료
     for (int j = 0; j < i < 5; i++) {
        System.out.println();
     }
    }

}
    

