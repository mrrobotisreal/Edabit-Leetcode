package java.LearnInheritance.Animal;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Animal", 1, 1, 5, 5);

    Dog dog = new Dog("Sadie", 8, 20, 2, 4, 1, 20, "short and silky");
    dog.eat();
    dog.walk();
    dog.run();

    Fish fish = new Fish("Fishy", 15, 85, 2, 2, 1);
    fish.eat();
    fish.move(50);
  }
}
