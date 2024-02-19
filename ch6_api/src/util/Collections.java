package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

// Collection 클래스
// 컬렉션(List, Set, Map)과 관련된 메소드 제공
// static 요소로 구성
// 동기화, fill(), copy(), sort(), binarySearch() 유용한 메소드 제공

// Collection 인터페이스
public class Collections {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    list.sort(Comparator.reverseOrder());

    // 오른쪽 두 칸 씩 이동
    Collections.rotate(list, 2);
    System.out.println(list);

    Collections.swap(list, 0, 2);
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder());
    Collections.sort(list, Comparator.reverseOrder());
    System.out.println(list);

    System.out.println(
      "3이 저장된 위치 : " + Collections.binarySearch(list, 3)
    );
    System.out.println(
      "3이 저장된 위치 : " + Collections.max(list)
    );
    System.out.println("최댓값 : " Collections.max(list));
    System.out.println("최솟값 : " Collections.min(list));

    // 리스트값을 하나의 값으로 채울 때
    Collections.fill(list, 9);
    System.out.println(list);
  }
}
