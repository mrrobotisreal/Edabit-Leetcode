public class Main {
  public static double convert(double pounds) {
    double converted = pounds / 0.45359237d;
    return converted;
  }

  public static void main(String[] args) {
    double convertedResult = convert(6);
    System.out.println("The converted result is: " + convertedResult + "kg");
  }
}
