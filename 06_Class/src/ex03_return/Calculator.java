package ex03_return;

public class Calculator {
  int add(int a, int b) {
    if (a < 0 || b < 0) return -9999;
    return a + b;
  }

  // 반환이 없는 메서드의 return
  void add(double a, double b) {
    if (a < 0 || b < 0) return;
    System.out.println(a + b);
  }
}
