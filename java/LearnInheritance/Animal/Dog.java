package java.LearnInheritance.Animal;

public class Dog extends Animal {
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  private void chew() {
    System.out.println("My dog " + this.getName() + " is chewing her food! Good girl!");
  }

  @Override
  public void eat() {
    System.out.println(this.getName() + " is eating...");
    chew();
    super.eat();
  }

  public void walk() {
    System.out.println("My dog " + this.getName() + " is walking.");
    move(3);
  }

  public void run() {
    System.out.println("My dog " + this.getName() + " is running!");
    move(9);
  }

  private void moveLegs(int speed) {
    System.out.println(this.getName() + " is moving her little legs at " + speed + "mph.");
  }

  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called.");
    moveLegs(speed);
    super.move(speed);
  }
}
