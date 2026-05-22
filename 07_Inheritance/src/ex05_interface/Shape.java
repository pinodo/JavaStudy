package ex05_interface;

public interface Shape {
  public double getPerimeter();
  public double getArea();
}

/* 사각형과 원의 넓이, 둘레를 구하는 방식이 달라서 본문을 채우기 어렵다.
   interface와 abstract와 쓰임새가 동일함 (위, 아래)
public abstract class Shape {
  public abstract double getPerimeter(); // 둘레 길이 구하기
  public abstract double getArea(); // 넓이 구하기
}
*/