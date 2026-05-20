package ex03_return;

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    int res = calc.add(1, 2);
    System.out.println(res);

    System.out.println(calc.add(3, 4));
    // 메서드 호출되는 방식(관계) 잘 보기
    calc.add(-1.1, -2.2);
    calc.add(1.1, 2.2);
    calc.add(-1.5, 1.5);
  }
}
