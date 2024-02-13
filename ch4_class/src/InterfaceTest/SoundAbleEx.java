package InterfaceTest;

public class SoundAbleEx {

  public static void main(String[] args) {
    Cat cat = new Cat();
    printSound(cat);
    Dog dog = new Dog();
    printSound(dog);
    // printSound(new Cat());
    // printSound(new Dog());
  }

  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }
}
