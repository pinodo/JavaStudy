package ex05_math_class;

public class Main {
  public static int getRandomInt(int min, int max) {
      return (int) (Math.random() * (max - min + 1)) + min;
    }

  public static void main(String[] args) {
    // 반올림 -> 정수형 (long, int) 반환
    Math.round(10.1);
    Math.round(-10.1);

    // 올림 -> 실수형 (double) 반환
    Math.ceil(10.1);
    Math.ceil(-10.1);

    // 내림 -> 실수형 (double) 반환
    Math.floor(10.1);
    Math.floor(-10.1);

    // 최댓값
    Math.max(10, 20);

    // 최솟값
    Math.min(10, 20);

    // 절대값
    Math.abs(-10);
    Math.abs(10);

    // 난수 생성
    Math.random(); // 0 ~ 1
    int a = (int) (Math.random() * 10); // 0 ~ 9
    int b = (int) (Math.random() * 10) + 1; // 1 ~ 10
    System.out.println("Random int btw 10 and 20: " + getRandomInt(10, 20));

    // 제곱, 루트 및 기타
    Math.pow(2, 2); // 4
    
    Math.sqrt(4); // 2.0
    Math.sqrt(2); // 1.4142...
  }
}
