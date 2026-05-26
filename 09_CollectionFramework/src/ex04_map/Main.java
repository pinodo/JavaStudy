package ex04_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    
    // 1. HashMap 객체 생성
    Map<String, Object> map = new HashMap<>();

    // 2. Entry 저장 (Key + Value => Entry)
    map.put("name", "홍길동");
    map.put("age", 30);
    map.put("hobbies", new String[] {"러닝", "게임"});

    // 3. Entry 수정 (기존에 사용하던 Key를 다시 사용하면? 기존 Value가 수정됨)
    map.put("name", "김삿갓");

    // 4. 정보 확인 (Value 확인 => Key를 이용해 Value 확인)
    System.out.println("이름: " + map.get("name"));
    System.out.println("나이: " + map.get("age"));
    System.out.println("취미: " + Arrays.toString((String[]) map.get("hobbies"))); // DownCasting -> Object 사용 시 Casting이 필요할 수 있다.
    System.out.println("생일: " + map.getOrDefault("birthday", "생일정보없음"));

    // 5. Entry 순회1 (Key를 이용한 순회 방식)
    Set<String> keys = map.keySet();
    System.out.println("=== Entry 순회1 ===");
    for (String key : keys) {
      // Object obj = map.get(key);
      System.out.println("Key: " + key + ", Value: " + map.get(key));
      // System.out.println(obj instanceof List<?> ? "Key: " + key + ", Value: " + Arrays.toString((String[]) map.get(key)) : "Key: " + key + ", Value: " + map.get(key));
    }

    // 6. Entry 순회2 (Entry 인터페이스를 이용한 순회 방식 - 추천)
    System.out.println("=== Entry 순회2 ===");
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    // 7. Map.of()
    // 정적 팩토리 메서드 of(): new 대신 사용하는 객체 생성 메서드
    // 이렇게 만든 Map 객체는 수정 불가능 (Immutable: put(), remove() 등 호출 시 오류 발생)
    // return할 때 Map.of();로 구성하는 것이 좋다.
    Map<String, Object> map2 = Map.of("name", "홍길동", "age", 30);
    System.out.println(map2);
  }
}
