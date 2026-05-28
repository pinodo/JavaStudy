package ex03_string_class;

public class Main {
  public static void main(String[] args) {
    // 문자열 리터럴
    // Heap 영역 내의 String Constant Pool에 저장 -> 동일한 문자열이 나타나면 기존 문자열 재사용
    String str01 = "Java";
    String str02 = "Java"; // 기존 풀의 Java 가리킴
    System.out.println(str01 == str02); // 주소 같나? true

    String str03 = "Java";
    String str04 = new String("Java"); // Constructor
    System.out.println(str03 = str04); // 주소 같나? false

    // 1. 문자열 길이
    String str1 = "hello world";
    System.out.println(str1.length());// 11

    // 2. 문자열 추출
    String str2 = "hello world";
    System.out.println(str2.charAt(0));// "h"
    System.out.println(str2.substring(0, 5));// "hello", endIndex 전 인덱스까지 프린트
    System.out.println(str2.substring(6, 11));// "world", endIndex 전 인덱스까지 프린트

    // 3. 문자열 포함 여부 및 위치(인덱스)
    String str3 = "https://www.google.com/";
    System.out.println("http로 시작: " + str3.startsWith("http"));// true (주어진 문자열로 시작하는지)
    System.out.println(".co.kr로 끝남: " + str3.endsWith(".co.kr"));// false (주어진 문자열로 끝나는지)
    System.out.println("google을 포함: " + str3.contains("google"));// true (주어진 문자열을 포함하는지)
    System.out.println("www의 인덱스: " + str3.indexOf("www"));// 8 (주어진 문자열의 인덱스)
    System.out.println("t가 쓰인 마지막 인덱스: " + str3.lastIndexOf("t"));// 2 (주어진 문자열이 쓰인 마지막 인덱스)

    // 4. 문자열 동등 비교
    String str4 = "java";
    System.out.println("java와 동일한지: " + str4.equals("java"));// true (주어진 문자열과 동등한지)
    System.out.println("JAVA와 동일한지: " + str4.equals("JAVA"));// false (대소문자가 다른 문자열과 동등한지)
    System.out.println("JAVA와 동일한지(대소문자 무시): " + str4.equalsIgnoreCase(str4));// true (주어진 문자열과 동등한지; 대소문자 무시하는 메서드)

    // 5. 빈 문자열 체크
    String str5_1 = "";
    String str5_2 = "     ";
    System.out.println(str5_1.isBlank());// true
    System.out.println(str5_1.isEmpty());// true
    System.out.println(str5_2.isBlank());// true
    System.out.println(str5_2.isEmpty());// false (공백 문자 있음)

    // 6. 빈 문자열 제거
    String str6 = "    hello  ";
    System.out.println(str6.strip().length()); // 5
    System.out.println(str6.trim().length()); // 5

    // 7. 문자열 변경
    String str7_1 = "HELLO";
    System.out.println(str7_1.toLowerCase()); // "hello"
    String str7_2 = "hello";
    System.out.println(str7_2.toUpperCase()); // "HELLO"

    String str7_3 = "192.168.0.5";
    System.out.println(str7_3.replace(".", "_")); // "192_168_0_5"
    System.out.println(str7_3.replaceAll(".", "_")); // "___________"
    System.out.println(str7_3.replaceAll("[.]", "_")); // "192_168_0_5"

    // 8. 문자열 형식 지정
    int n = 12345;
    System.out.println(String.format("%,d", n));// "12,345", 뒤부터 3자리씩 끊음
    System.out.println(String.format("%9d", n));// "    12345" (length: 9)
    System.out.println(String.format("%-9d", n));// "12345    " (length: 9)
    System.out.println(String.format("%09d", n));// "000012345" (length: 9)

    System.out.println(String.format("%.2f", (double) n));// "12345.00"

    String str8 = "hello";
    System.out.println(String.format("%7s", str8));// "  hello" (length: 7)
    System.out.println(String.format("%-7s", str8));// "hello  " (length: 7)

    // 9. 문자열 -> 배열
    String str9_1 = "abc";
    char[] arr = str9_1.toCharArray();
    for (char ch : arr) {
      System.out.println(ch); // 'a', 'b', 'c'
    }

    byte[] bytes = str9_1.getBytes();
    for (byte b : bytes) {
      System.out.println(b); // 97, 98, 99 (a, b, c의 byte 값) ASCII code
    }

    String str8_2 = "봄->여름->가을->겨울";
    String[] seasons = str8_2.split("->");
    for (String season : seasons) {
      System.out.println(season); // "봄", "여름", "가을", "겨울"
    }

    // 10. 배열 -> 문자열
    String[] seasons2 = {"봄", "여름", "가을", "겨울"};
    String str10 = String.join("->", seasons2);
    System.out.println(str10); // "봄->여름->가을->겨울"
  }
}
