package java.LearnInheritance.Animal;

public class Fish extends Animal {
  private int gills;
  private int eyes;
  private int fins;

  public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
    super(name, 1, 1, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }

  private void rest() {
    System.out.println("Fishy is resting... zzzz....");
  }

  private void moveMuscles() {
    System.out.println("Fishy is lifting weights! I mean moving muscles...");
  }

  private void moveBackFin() {
    System.out.println("Fishy is thrashing that back fin!!! Whoosh!!!!");
  }

  private void swim(int speed) {
    moveMuscles();
    moveBackFin();
    super.move(speed);
    rest();
  }

  @Override
  public void move(int speed) {
    swim(50);
    super.move(50);
  }
}
