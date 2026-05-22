package ex05_interface;

// 인터페이스 Shape을 구현하는 클래스: 구현체

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
}
