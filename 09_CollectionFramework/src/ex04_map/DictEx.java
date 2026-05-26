package ex04_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictEx {
  public static void main(String[] args) {
    Map<String, String> dict = new HashMap<>();
    dict.put("apple", "사과");
    dict.put("banana", "바나나");
    dict.put("computer", "컴퓨터");
    dict.put("dream", "꿈");
    dict.put("elite", "뛰어난 사람");

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("(apple, banana, computer, dream, elite)\n영어 단어를 입력하세요: ");
      String input = sc.nextLine();
      System.out.println(dict.get(input) != null ? input + "의 뜻은 " + dict.get(input) + "입니다." : input + "은(는) 단어장에 없는 단어입니다.");
    }
  }
}
