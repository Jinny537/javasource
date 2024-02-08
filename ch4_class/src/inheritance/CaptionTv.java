package inheritance;

public class CaptionTv extends Tv {

  // CaptoinTv () {super();} : 컴파일러가 자동으로 만들어줌

  boolean cpation;

  public CaptionTv(boolean power, int channel, boolean cpation) {
    super(power, channel);
    this.cpation = cpation;
  }

  public CaptionTv(boolean cpation) {
    this.cpation = cpation;
  }

  void displayCaption(String text) {
    // if (capion!=true) == if(!caption)

    // if(caption == true)
    if (cpation) {
      System.out.println(text);
    }
  }
}
