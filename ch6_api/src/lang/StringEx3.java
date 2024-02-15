package lang;

public class StringEx3 {

  public static void main(String[] args) {
    String str1 = "Hello!! Java";

    // 문자열 => char 배열
    // str1.length() : str1의 길이 리턴
    // {'E','e','l'}

    // char arr1[] = {
    //   str1.charAt(0),
    //   str1.charAt(1),
    //   str1.charAt(1),
    //   str1.charAt(2),
    //   str1.charAt(3),
    //   str1.charAt(4),
    //   str1.charAt(5),
    //   str1.charAt(6),
    //   str1.charAt(7),
    //   str1.charAt(8),
    //   str1.charAt(9),
    //   str1.charAt(10),
    //   str1.charAt(11),
    // };
    char arr2[] = new char[str1.length()];

    for (int i = 0; i < str1.length(); i++) {
      arr2[i] = str1.charAt(i);
    }
    System.out.println(arr2);

    String str2 = "자바 프로그래밍";
    // '프' 문자가 존재한다면 들어있음 or 있음
    str2.contains("프");

    if (str2.contains("프")) {
      System.out.println("들어있음");
    } else {
      System.out.println("없음");
    }

    System.out.println(str2.contains("프") ? "들어있음" : "없음");
  }
}
