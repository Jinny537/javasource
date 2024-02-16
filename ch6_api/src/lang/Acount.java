package lang;

import java.util.Scanner;

public class Acount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] argArr = null;

    while (true) {
      String prompt = ">>";
      System.out.println(prompt);

      String input = sc.nextLine();
      input = input.trim();
      // 정규싣(Regular exression) : regExp
      argArr = input.split(" +"); // 공백+ (공백이 최소 1 ~ 무제한)ㅗ

      String command = argArr[0].trim();

      if ("".equals(command)) continue;

      command = command.toLowerCase();

      if (command.endsWith("q")) {
        System.exit(0);
      } else {
        for (int i = 0; i < argArr.length; i++) {
          System.out.println(argArr[i]);
        }
      }
    }
  }
}
