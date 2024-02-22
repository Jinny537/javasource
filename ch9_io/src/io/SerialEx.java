package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 직렬화(Serialization)
// 객체를 주고받는 개념
// objectinputstream(스트림에서 객체 입력)

public class SerialEx {

  public static void main(String[] args) {
    person1 = new person1("홍길동", "엔니지어", "010-1234-1234");

    try (
      FileOutputStream fo = new FileOutputStream("c:\\temp\\serial.dat");
      ObjectOutputStream oos = new ObjectOutputStream(fo);
      FileInputStream fis = new FileInputStream("c:\\temp\\serial.dat");
    ) {
      oos.writeObject(person1);
      oos.writeObject(person2);

      for (int i = 0; i < 2; i++) {
        Person p = ois.readObject();
        System.out.println(p);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
