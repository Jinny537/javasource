package abstractclass;

public class Ambulance extends Car {

  void siren() {
    System.out.println("siren");
  }

  @Override
  void drive() {}
}
