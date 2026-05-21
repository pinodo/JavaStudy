package ex05_constructorEx;

public class Circle extends Shape {
  private double radius;
  public static final double PI = 3.14159;

  public Circle(String shapeName, double radius) {
    super(shapeName);
    this.radius = radius;
  }

  private double getArea() {
    return radius * radius * PI;
  }

  private double getPerimeter() {
    return radius * 2 * PI;
  }

  void display() {
    System.out.println("도형 이름: " + shapeName);
    System.out.println("도형 종류: 원");
    System.out.println("반지름: " + radius);
    System.out.println("넓이: " + getArea());
    System.out.println("둘레: " + getPerimeter());
  }
}
