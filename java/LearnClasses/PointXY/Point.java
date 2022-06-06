package java.LearnClasses.PointXY;

public class Point {
  private int x;
  private int y;

  public Point() {
      this(0, 0);
  }

  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

  public int getX() {
      return this.x;
  }

  public void setX(int x) {
      this.x = x;
  }

  public int getY() {
      return this.y;
  }

  public void setY(int y) {
      this.y = y;
  }

  public double distance() {
      Point point = new Point(0, 0);
      return distance(point);
  }

  public double distance(int x, int y) {
      Point point = new Point(x, y);
      return distance(point);
  }

  public double distance(Point point) {
      double dist = Math.sqrt(((point.getX() - this.x) * (point.getX() - this.x)) + ((point.getY() - this.y) * (point.getY() - this.y)));
      return dist;
  }
}
