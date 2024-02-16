package lang;

// java.lang.Byte ==> byte의 객체형
// java,lang.Short ==> short
// java,lang.Character ==> char
// java,lang.Integer ==> int
// java.lang.Long ==> long
// java.lanh.Float ==> float
// java.lang.Double ==> double
// java.alng.Boolean ==> boolean

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10;

    Integer i2 = 10;
    Integer.valueOf(20);

    // intValue() : Integer => int
    int result = i2.intValue();
    int result2 = i2;
  }
}
