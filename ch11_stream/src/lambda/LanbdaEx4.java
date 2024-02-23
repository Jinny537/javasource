package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 켈랙션 프레임워크의 함수형 인터페이스를 매게변수로 사용하는 메서드

public class LanbdaEx4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    // list 값을 사용
    // for(int i = 0; i < list.size; i++)
    // for(int i : list)
    // forEach(Consumer<String> action)
    list.forEach(i -> System.out.println(i));

    // list에서 2 또는 3 배수 제거
    // removeIf(Predicate<? super E> filter)

    list.removeIf(i2 -> i2 % 2 == 0 || i2 % 3 == 0);

    // list의 각 요송[ 10을 곱한다
    list.replaceAll(i -> i * 10);
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    // map의 모든 요소를 {kry, value} 출력
    map.forEach((k, v) -> System.out.printf("{%s, %s}\n", k, v));
  }
}
