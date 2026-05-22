package ex04_abstractEx;

public class Main {
  public static void main(String[] args) {

    // Abstract problem 1
    Animal[] animals = new Animal[3];

    animals[0] = new Dog();
    animals[1] = new Eagle();
    animals[2] = new Shark();

    for (Animal animal : animals) {
      animal.move();
    }
  }
}
