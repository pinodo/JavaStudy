package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
  public static void main(String[] args) {
    
    // 확인할 사항
    // 1. 중복해서 저장해보기 (중복 저장이 안되어야 정상)
    // 2. 존재 여부 확인해보기 (동작해야 정상)
    // 3. 객체 정보 출력해보기

    Set<Member> members = new HashSet<>();
    members.add(new Member("지수", 22));
    members.add(new Member("로제", 24));
    members.add(new Member("제니", 26));
    members.add(new Member("리사", 28));
    members.add(new Member("리사", 28));

    Member target = new Member("지수", 22);
    System.out.println(members.contains(target) ? target + " 있음." : target + " 없음.");

    int idx = 0;
    for (Member member : members) {
      System.out.println(++idx + ": " + member);
    }
  }
}
