package InterfaceTest;

public class RemoteEx {

  public static void main(String[] args) {
    Televition tv = new Televition();
    tv.turnOn();
    tv.setVolume(9);
    tv.turnOff();

    Audio audio = new Audio();
    audio.turnOn();
    audio.setVolume(15);
    audio.turnOff();

    exec(new Televition());
    exec(new Audio());
  }

  public static void exec(RemoteControl rc) {
    rc.turnOn();
    rc.setVolume(15);
    rc.turnOff();
  }
}
