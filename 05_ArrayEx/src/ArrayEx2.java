import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
  public static void main(String[] args) {
    // 1. 다음 정수형 배열에 저장된 모든 요소의 합계와 평균을 출력하세요.
    int[] numbers1 = {4, 7, 9, 12, 17, 19, 24, 28, 30};
    double res1 = 0;
    for (double num : numbers1) {
      res1 += num;
    }
    System.out.println("Q1: " + res1 + " " + res1 / numbers1.length);

    // 2. 다음 정수형 배열에 저장된 모든 요소 중 최대값과 최소값을 출력하세요.
    int[] numbers2 = {42, 17, 93, 120, 117, 59, 24, 28, 39};
    int resMax = numbers2[0];
    int resMin = numbers2[0];
    for (int num : numbers2) {
      if (num >= resMax) {
        resMax = num;
      }
      if (num <= resMin) {
        resMin = num;
      }
    }
    System.out.println("Q2: " + resMax + " (max), " + resMin + " (min)");
   
    // 3. 다음 배열의 길이를 4로 늘려서 "autumn", "winter"를 저장하세요.
    String[] seasons = {"spring", "summer"};
    String[] newSeasons = new String[4];
    System.arraycopy(seasons, 0, newSeasons, 0, 2);
    seasons = newSeasons;
    newSeasons[2] = "autumn";
    newSeasons[3] = "winter";
    System.out.println("Q3: " + Arrays.toString(newSeasons));
   
    // 4. 다음 정수형 배열의 모든 요소들의 저장 순서를 뒤집으세요.
    int[] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8};
    int temp;
    for (int i = 0; i < numbers4.length / 2; i++) {
      temp = numbers4[i];
      numbers4[i] = numbers4[numbers4.length - 1 - i];
      numbers4[numbers4.length - 1 - i] = temp;
    }
    System.out.println("Q4: " + Arrays.toString(numbers4));
   
    // 5. 다음 정수형 배열이 오름차순으로 정렬되어 있으면 true, 아니면 false를 boolean result 변수에 저장하세요.
    int[] numbers5 = {1, 2, 3, 4, 5, 0};
    boolean isAscend = true;
    for (int i = 0; i < numbers5.length - 1; i++) {
      if (numbers5[i + 1] < numbers5[i]) {
        isAscend = false;
        break;
      }
    }
    System.out.println("Q5: Ascending order: " + isAscend);
   
    // 6. uppers 배열에는 대문자를 순서대로 저장하고, lowers 배열에는 소문자를 순서대로 저장하세요.
    // 배열의 타입은 char[]로 처리하세요.
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter a word: ");
    // String word = scanner.next();
    // char[] wordList = new char[word.length()];
   
    // 7. 10진수(number)를 2진수로 변환한 결과를 int[] binary에 저장하세요.

    // 8. 아래 apt 배열에는 각 가구당 인원수가 저장되어 있습니다.
    // 각 층마다 총 몇 명이 거주하는지 출력하세요.
    // int[][] apt = {
    //   {2, 5},  // 1층: 1호에 2명, 2호에 5명 거주
    //   {3, 4},  // 2층: 1호에 3명, 2호에 4명 거주
    //   {1, 4},
    //   {2, 3},
    //   {3, 3}
    // };
    // [출력 예시]
    // 1층 : 7명
    // 2층 : 7명
    // ...
   
    // 9. 2단부터 9단까지 구구단을 String[][] gugudan 2차원 배열에 저장하세요.

    // 10. 다음 2차원 배열 T의 모든 요소를 시계 방향으로 90도 회전한 상태로 바꾸세요.
    //     int[][] T = {
    //         {1, 1, 1, 1, 1},
    //         {0, 0, 1, 0, 0},
    //         {0, 0, 1, 0, 0},
    //         {0, 0, 1, 0, 0},
    //         {0, 0, 1, 0, 0}
    //     };
  }
}
