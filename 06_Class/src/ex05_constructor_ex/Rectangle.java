package ex05_constructor_ex;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(String shapeName, int width, int height) {
    super(shapeName);
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }

  public int getPerimeter() {
    return 2 * (width + height);
  }

  public void display() {
    System.out.println("도형 이름: " + shapeName);
    System.out.println("도형 종류: 사각형");
    System.out.println("가로: " + width);
    System.out.println("세로: " + height);
    System.out.println("넓이: " + getArea());
    System.out.println("둘레: " + getPerimeter());
  }
}
