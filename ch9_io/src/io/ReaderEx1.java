package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

// 2. 문자 기빈 스트림(문자)
//     Reader(추상)
//     Writer(추상)

// Charset 표준
// ISO-8859-1, UTF-8, UTF-16
// 윈도우즈 MS949
public class ReaderEx1 {

  public static void main(String[] args) throws IOException {
    Reader reader;
    Writer writer;

    reader = new FileReader("c:\\temp\\file.txt", Charset.forName("utf-8"));

    // reader.read(); 하나의 문자 읽어오기
    // reader.read(null); 입력소스로부터 배열의 크기만큼 읽어서 배열에 저장
    // reader.read(null, 0, 0); 입력소스로부터 len제 만큼 읽어서 배열의 off 위치에 저장

    Writer write = new FileWriter("c:\\temp\\test1.txt");
    // writer.write(String str);
    // wrtier.write(int ch);
    // writr.write(char[] cbuf);

    int data = 0;
    char[] cbuf = new char[1024];
    try {
      while ((data = reader.read(cbuf)) != -1) {
        // System.out.print((char) data);
        // writer.write(data)
        writer.write(new String(cbuf));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        reader.close();
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
