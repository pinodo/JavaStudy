package ex03_stream_api.member_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemberMain {
  public static void main(String[] args) {

    List<Member> members = Arrays.asList(
      new Member("리사", 20, "축구"),
      new Member("제니", 28, "게임"),
      new Member("지수", 23, "노래"),
      new Member("로제", 29, "수영"),
      new Member("원영", 30, "테니스"),
      new Member("윈터", 21, "등산"),
      new Member("영지", 24, "조깅")
    );
    
    Stream<Member> stream = members.stream();

    List<String> finalMembers = 
    stream.filter(member -> member.getAge() >= 25)
      .map(member -> member.getName() + " 님")
      .collect(Collectors.toList());

    System.out.println(finalMembers);
  }
}
