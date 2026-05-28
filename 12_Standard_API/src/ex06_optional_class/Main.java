package ex06_optional_class;

import java.util.Optional;

public class Main {
  private static String maybeNull() {
    double rdm = Math.random();
    if (rdm < 0.5) {
      System.out.println("Num: " + rdm);
      return null;
    } else {
      System.out.println("Num: " + rdm);
      return "Hello";
    }
  }

  public static void main(String[] args) {
    // Optional<> class
    // 값이 존재할 수도, 없을 수도 있는 객체를 감싸는 래퍼 클래스
    // 값이 비어있으면 Optional.empty()를 유지하는 컨테이너 -> NullPointerException을 방지함 -> if (obj != null) 체크 생략 가능
    // 반환타입을 Optional로 설정 -> 반환값이 null일 수 있음을 명시적으로 나타냄
    Optional<String> opt = Optional.of("Java");

    System.out.println(opt);
    System.out.println(opt != null);

    Optional<String> opt2 = Optional.empty();

    System.out.println(opt2);
    System.out.println(opt2 == null);

    Optional<String> opt3 = Optional.ofNullable(maybeNull());

    // 1. 값이 없으면 "Default" 반환
    String res1 = opt3.orElse("Default");
    System.out.println(res1);

    // 2. 값이 없으면 람다식으로 생성한 결과 반환 (성능상 이점)
    String res2 = opt3.orElseGet(() -> "Default from Lambda");
    System.out.println(res2);

    // 3. 값이 없으면 예외 던지기
    // String res3 = opt3.orElseThrow(() -> new RuntimeException("데이터가 없습니다."));
    // System.out.println(res3);

    try {
      String res4 = opt3.orElseThrow();
      System.out.println(res4);
    } catch (RuntimeException e) {
      System.err.println(e.getMessage());
    }
  }
}
