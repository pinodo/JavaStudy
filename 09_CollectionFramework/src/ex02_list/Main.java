package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    // 배열 리스트 (ArrayList) 다루기
    // 배열과 같은 원리로 동작

    // 1. 생성 (생성 시점에 타입 결정)
    List<String> members = new ArrayList<>(); // 초기 배열 크기: 10

    // 2. 요소 추가하기
    members.add("지수");
    members.add("제니");
    members.add("리사");
    members.add("로제");

    // 3. 요소 확인
    System.out.println(members);
    System.out.println(members.get(0));
    System.out.println(members.get(3));


    // 4. 길이 확인
    System.out.println(members.size());

    // 5. 요소 삭제
    String removed = members.remove(0);
    System.out.println("삭제된 요소: " + removed);
    boolean isRemoved = members.remove("지수");
    System.out.println(isRemoved ? "삭제 성공" : "삭제 실패"); // 이미 삭제돼서 삭제가 안됨.

    System.out.println(members);

    // 6. 요소 존재여부 확인
    String target = "윤아";
    if (members.contains(target)) {
      System.out.println(target + " 있다.");
    } else {
      System.out.println(target + " 없다.");
    }

    // 7. for 문 순회 (같은 값을 반환하는 반복적인 메서드 호출 지양)
    // for (int i = 0; i < members.size(); i++) { // members.size() 가 여러번 돌게 됨. 안좋은 코드
    //   System.out.println((i + 1) + ": " + members.get(i));
    // }
    for (int i = 0, length = members.size(); i < length; i++) { // for 문에 첫번째 칸에 선언해줌.
      System.out.println((i + 1) + ": " + members.get(i));
    }
    
    int i = 0;
    for (String member : members) {
      System.out.println(++i + ": " + member);
    }
  }
}
