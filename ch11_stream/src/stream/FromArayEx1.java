package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 같은 종류의 데이터를 다룰 때 사용했던 방법
// 배열, 리스트, set, map
// fot, Iterator
// list.sort(), Collections.sort()
// Arrays.sort()

// 같은 기능의 메서드들 중복, 컬렉션이나 배열을 다루는 방법이 제각각이고 해결하기 위해
// stream 사용

// stream
// 데이터 소스를 추상화시키고, 자주 사용하는 메서드들을 정의해 놓음
// 데이터 소슬를 변경하지 않음(데이터를 읽기만 함)
// 일회용임(스트림 한번 사용하면 닫힘)
// 작업을 내부 반복으로 처리

public class FromArayEx1 {

  public static void main(String[] args) {
    /// 기존 방법 -  배열, 리스트 여부에 땨라 절렬방법이 다르고, 원본 자체에 정렬이 일어난다.
    String[] strArr = { "ad", "abc", "aaa" };
    // Arrays.sort(strArr); // 원본 자체가 변경
    // System.out.println(Arrays.toString(strArr));
    List<String> list = Arrays.asList(strArr);
    // Collections.sort(list); // 원본 자체가 변경
    // System.out.println(list);

    // Stream 상용 방식 - 데이터 소스는 다르나 정렬/출력 방법 동일
    Stream<String> stream1 = Arrays.stream(strArr);
    Stream<String> stream2 = list.stream();

    stream1.sorted().forEach(item -> System.out.println(item));
    stream2.sorted().forEach(item -> System.out.println(item));

    // 정렬된 결과가 필요하다면
    List<String> sortedList = stream2.sorted().collect(Collectors.toList());

    System.out.println("정렬 후");
    System.out.println(Arrays.toString(strArr));
    System.out.println(list);
  }
}
