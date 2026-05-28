package ex04_string_builder_class;

public class Main {
  public static void main(String[] args) {
    // StringBuilder Class
    // String 클래스의 한계(불변)를 극복하기 위함

    // 1. 객체 생성
    StringBuilder sb = new StringBuilder("Java");

    // 2. 문자열 추가 (끝에 추가)
    System.out.println(sb.append(" Study"));

    // 3. 문자열 삽입 (특정 위치)
    System.out.println(sb.insert(4, " Script"));

    // 4. 문자열 삭제 (시작 인덱스, 끝 인덱스 직전까지)
    System.out.println(sb.delete(4, 11));

    // 5. 문자열 치환
    System.out.println(sb.replace(0, 4, "Python"));

    // 6. 문자열 뒤집기
    System.out.println(sb.reverse());

    // 7. 최종적으로 String으로 변환 (반드시 필요)
    sb.reverse();
    String result = sb.toString();
    System.out.println(result);
  }
}
