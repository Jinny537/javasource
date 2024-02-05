package exam;

import java.security.KeyStore.LoadStoreParameter;
import java.time.LocalDateTime;

public class board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int bno;
  private String title;
  private String content;
  private String user;
  private LocalDateTime regDate;
  private LocalDateTime lastModifeDate;

  // default
  public board() {}

  // 4개만
  public board(int bno, String title, String content, String user) {
    this.bno = bno;
    this.title = title;
    this.content = content;
    this.user = user;
  }
}
