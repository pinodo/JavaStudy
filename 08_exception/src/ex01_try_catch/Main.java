package ex01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // 사용자 입력을 위한 Scanner 객체 만들기
    Scanner sc = new Scanner(System.in);
    int a, b;

    try {

      // 코드 작성하는 부분
      while (true) {
        System.out.print("첫 번째 숫자 입력: ");
        a = sc.nextInt();
        System.out.print("두 번째 숫자 입력: ");
        b = sc.nextInt();
  
        System.out.println("몫: " + (a / b) + ", 나머지: " + (a % b));

      }
      
    } catch (ArithmeticException e) {
      
      // 예외 처리하는 부분: 미작성시 오류를 알 수 없음
      // 주요 메서드: getMessage(), printStackTrace()
      // System.err.println("예외사유: " + e.getMessage());
      // System.err.println("0으로 나눌 수 없습니다. 다시 시도하세요!");

      e.printStackTrace();
    } catch (InputMismatchException e) {

      // 다중 catch 블록: 자식 객체를 위쪽에, 부모 객체를 아래쪽에 배치함
      System.out.println("정수만 입력할 수 있습니다.");
    }

  }
}
