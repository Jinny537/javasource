package lang;

import java.sql.Date;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자

    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    // return type => 변수담기 or sout
    char ch = str1.charAt(0);
    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat : 문자열 뒤에 열결
    String result = str1.concat(" World");
    System.out.println("concat() : " + result);

    // compareTo() : 0, -1, 1 리턴
    // 문자열을 사전 순서로 비교
    // 같으면 0, 사전순으로 이전이면 음수, 이후면 양수
    // a 97, b 98 (97-98)
    // 첫번째 문자가 같으면 다음 문자를 비교한다
    System.out.println("compareTo() : " + str1.compareTo(str3));
    System.out.println("compareTo() : " + "aaa".compareTo("bbb"));
    System.out.println("compareTo() : " + "bbb".compareTo("aaa"));
    System.out.println("compareTo() : " + "bbb".compareTo("baa"));

    // contains() : 지정된 문자열이 포함되었는지 검사
    System.out.println("contains() : " + str1.contains("e"));

    // endswith() ; 지정된 문자열로 끝나는지 검사
    System.out.println("endswith() : " + str3.endsWith("t"));
    System.out.println("endswith() : " + "hello.txt".endsWith("txt"));

    // startswith() : 지정된 문자열로 시작하는지 검사
    System.out.println("startswith() : " + str3.startsWith("H"));

    // equals() / equalsIgnoreCase() - 대소문자 구별하지 않고 비교
    // Hello == HELLO (문자 대소문자 구별 함)
    System.out.println(
      "equalsIgnoreCase() : " + str1.equalsIgnoreCase("HELLO")
    );
    System.out.println("equals() : " + str1.equals("HELLO"));

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //             있으면 위치 인덱스, 없으면 -1
    System.out.println("indexOf() : " + str1.indexOf("s"));
    System.out.println("indexOf() : " + str1.indexOf('s'));
    System.out.println("indexOf() : " + str1.indexOf('e'));
    // 2번을 시작위치로 지정
    System.out.println("indexOf() : " + str1.indexOf('e', 2));

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에부터 찾아서 위치 반환
    String str4 = "java.lang.String";
    System.out.println("lastIntdexOf() : " + str4.lastIndexOf(".")); // 9
    System.out.println("indexOf() : " + str4.indexOf(".")); // 4

    // length() : 문자열 길이 반환

    // replace() :  문자를 새로운 문자로 바꾼 문자열 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace() : " + replaceStr);
    str2 = str2.replace('H', 'h');
    System.out.println(str2); // Hello String에 담은 문자열은 못바꿈, 바꾸려면 원본에 담아줘야 함
    str2 = str2.replace("ll", "LL");
    System.out.println(str2);

    // replace랑 replaceAll은 같음
    // replaceFirst는 앞에 있는 문자만 변환하여 반환
    str4 = "Hellollo";
    System.out.println("replace() : " + str4.replace("ll", "LL")); // HeLLoLLo
    System.out.println("replaceAll() : " + str4.replaceAll("ll", "LL")); // HeLLoLLo
    System.out.println("replaceFirst() : " + str4.replaceFirst("ll", "LL")); // HeLLollo

    // split() : 문자열을 분라(기준에 따라)한 후 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string);
    }
    str4 = "dog,cat,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string);
    }
    // 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string);
    }

    // substring() : 시작위치부터 끝 위치에 포함된 문자열 추출(끝위치는 포함하지 않는다)
    System.out.println(str1.substring(1));
    System.out.println(str1.substring(1, 4));

    // toLowerCase() : 모든 문자를 소문자로 변환
    // tpUpperCase() : 모든 문자를 댜문자로 변환
    System.out.println("toLowerCase() : " + str1.toLowerCase());
    System.out.println("toUpperCase() : " + str1.toUpperCase());

    // toString()
    System.out.println(str1);
    System.out.println(str1.toString());

    // 공백 하나는 문자 하나
    // trim() : 앞, 뒤 공백만을 제거
    // "Hello" == "Hello "
    str4 = "    Hello        World       ";
    System.out.println("trim() 전 " + str4);
    System.out.println("trim() 후 " + str4.trim());

    // valueOf() :  지정된값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100");
    String num1 = String.valueOf(100); // int => String
    System.out.println(num1);
    num1 = String.valueOf(1.3); //double => String
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000L);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date(ch);
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + "";

    // string.valueOf(10) <=> Integer.parseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Integer.parseDouble("10.3") or Double.valueOf("10.3")

    Double d1 = Double.parseDouble("10.3");
    Float f1 = Float.parseFloat("10.3f");
    Long.parseLong("10L");
  }
}
