package java.LearnClasses.CarpetCost;

public class Calculator {
  private Floor floor;
  private Carpet carpet;

  public Calculator(Floor floor, Carpet carpet) {
      this.floor = floor;
      this.carpet = carpet;
  }

  public double getTotalCost() {
    double cost = this.carpet.getCost();
    double area = this.floor.getArea();
    return cost * area;
  }
}
