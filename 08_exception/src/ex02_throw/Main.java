package ex02_throw;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // try with resources: 자동으로 close() 처리함
    // try (자원 생성) { } catch() { }
    try (Scanner sc = new Scanner(System.in);) {
      
      System.out.print("점수(0~100)를 입력하세요: ");
      int score = sc.nextInt();

      if (score < 0 || score > 100) {
        throw new RuntimeException(score + "점은 잘못된 입력입니다. 다시 시도하세요!");
      }

      System.out.println( score >= 60 ? "합격" : "불합격" );
      
    } catch (Exception e) {
      System.err.println(e.getMessage());

    } /* finally {

      // 항상 마지막에 실행되는 영역
      // 일반적으로 자원 정리할 때 사용
      sc.close();
    } */
  }
}
