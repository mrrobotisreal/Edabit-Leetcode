package java.LearnClasses.TestCar;

public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Car mercedes = new Car();
    porsche.setModel("Carrera");
    System.out.println("Porsche " + porsche);
    System.out.println("Model is: " + porsche.getModel());
  }
}
