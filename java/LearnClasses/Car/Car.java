package java.LearnClasses.Car;

public class Car {
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if (validModel.equals("porsche") || validModel.equals("mercedes")) {
      this.model = model;
    }
  }

  public String getModel() {
    return this.model;
  }
}
