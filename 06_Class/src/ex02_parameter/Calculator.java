package ex02_parameter;

class Main1 {
  public static void main(String[] args) {
    Calculator myCalc = new Calculator();
    myCalc.add(1, 2);
    myCalc.add(1.5, 2.5);
    int[] arr = {1, 3, 5, 7, 9}; // 정적 초기화
    myCalc.add(arr);
    myCalc.add(new int[] {1, 2, 3, 4, 5}); // 동적 초기화
    myCalc.multiply(1, 2, 3, 4);
    myCalc.multiply(1, 2); // 정확한 인자 파라미터를 먼저 찾음
  }
}

public class Calculator {

  // 메서드 오버로딩 (Overloading)
  // 같은 이름의 메서드 + 개수나 타입이 다른 매개변수가 있을 때

  // 타입이 다른 경우
  void add(int a, int b) {
    System.out.println(a + b);
  }
  void add(double a, double b) {
    System.out.println(a + b);
  }
  void add(int[] numbers) {
    int result = 0;
    for (int n : numbers) {
      result += n;
    }
    System.out.println(result);
  }

  // 파라미터 갯수가 다른 경우
  // void multiply(int a, int b) {
  //   System.out.println(a * b);
  // }
  // void multiply(int a, int b, int c) {
  //   System.out.println(a * b * c);
  // }
  void multiply(int a, int b, int... numbers) { // 가변인자 처리를 위한 말줄임표(...), 최소 파라미터 개수가 2개일 때
    // 가변인자는 실제로 배열로 처리됨
    int result = a * b;
    for (int n : numbers) {
      result *= n;
    }
    System.out.println(result);
  }
}
