package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {

  public static void main(String[] args) throws IOException {
    InputStream in = null;
    OutputStream out = null;

    // try {
    //   in = new FileInputStream(new File("c:\\temp\\kbs_1.mp4"));
    //   // out = System.out;
    //   out = new FileOutputStream("c:\\temp\\kbs_1-copy.mp4");

    //   int date = 0;
    //   byte b[] = new byte[1024];
    //   while ((date = in.read(b)) != -1) {
    //     out.write(b);
    //   }
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } finally {
    //   try {
    //     in.close();
    //     out.close();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // }



    

    try {InputStream in = new FileInputStream(new File("c:\\temp\\kbs_1.mp4")); OutputStream out = new FileOutputStream("c:\\temp\\kbs_1-copy.mp4");} {
      int date = 0;
      byte b[] = new byte[1024];
      while ((date = in.read(b)) != -1) {
        out.write(b);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
