package ex01_object_class;

public class Main {
  public static void main(String[] args) {

    int a = 20;
    int b = 20;
    
    User user1 = new User(1, "홍길동");
    User user2 = new User(1, "홍길동");

    Integer a1 = 20;
    Integer b1 = 20;

    System.out.println("[int] a, b 값이 같나? " + (a == b));
    // System.out.println("a, b 내용이 같나? " + a.equals(b)); // 쓸 수 없음 (기본 타입은 비교 불가, 스택에 저장)

    System.out.println("[User] user1, user2 주소가 같나? " + (user1 == user2));
    System.out.println("[User] user1, user2 내용이 같나? " + user1.equals(user2));

    System.out.println("[Integer] a1, b2 주소가 같나? " + (a1 == b1)); // Integer caching 사용(-128 ~ 127 범위의 Integer 객체를 미리 만들어 사용) -> 범위 벗어나면 false
    System.out.println("[Integer] a1, b2 내용이 같나? " + a1.equals(b1));
  }
}
