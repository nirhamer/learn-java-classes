abstract class Shape {

  /**
   * A specific function to calculate perimeter
   * <p>Must be overriden</p>
   * @return  double perimeter in sq.meters.
   */
  abstract double getPerimeter();

  abstract double getArea();
}
class Circle extends Shape {
  private double a;
  private static final double PI = Math.PI;

  public Circle(double one) {
    this.a = one;
  }
  public double getPerimeter() {
    return 2 * PI * a;
  }
  public double getArea() {
    double a_square = Math.pow(a, 2);
    return PI * a_square;
  }
}
class Rectangle extends Shape {
  private double a;
  private double b;

  public Rectangle(double one, double two) {
    this.a = one;
    this.b = two;
  }
  public double getPerimeter() {
    return (a + b) * 2;
  }
  public double getArea() {
    return a * b;
  }
}
class Triangle extends Shape {
  private double a;
  private double b;
  private double c;

  public Triangle(double one, double two, double thre) {
    this.a = one;
    this.b = two;
    this.c = thre;
  }
  public double getPerimeter() {
    return a + b + c;
  }
  public double getArea() {
    //FIXME: look at wiki and find the formula
    //  than rename the variable
    /*
    magic: is ised for....
    see: http://so.com/bla-bla
     */
    double magic = (a + b + c) / 2;
    return Math.sqrt(magic * ((magic - a) * (magic - b) * (magic - c)));
  }
}