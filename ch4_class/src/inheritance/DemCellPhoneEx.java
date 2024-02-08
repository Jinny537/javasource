package inheritance;

public class DemCellPhoneEx {

  public static void main(String[] args) {
    DmbCellphone dmbcellphone = new DmbCellphone();

    dmbcellphone.model = "삼성";
    dmbcellphone.color = "black";
    dmbcellphone.channel = 7;

    dmbcellphone.powerOn();
    dmbcellphone.turnOnDmb();
    dmbcellphone.changeChannelDmb(16);
    dmbcellphone.turnOfdmb();
    dmbcellphone.bell();
    dmbcellphone.sendVoice("안녕하세요");
    dmbcellphone.receiveVoce("반갑습니다");
    dmbcellphone.hangUp();
  }
}
