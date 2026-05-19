public class HelloWorld {
  // public class 의 경우, 파일명과 클래스명이 동일해야 한다.

  // Naming Convention (명명 규칙)
  // PascalCase: 클래스명은 대문자로 시작하며, 단어가 이어질 때마다 대문자로 시작한다.
  // camelCase: 변수명과 메소드명은 소문자로 시작하며, 단어가 이어질 때마다 대문자로 시작한다.
  // snake_case: 일반적으로 사용되지 않지만, 단어 사이에 언더스코어(_)를 사용하는 방식이다. (예: my_variable_name)
  // kebab-case: 일반적으로 사용되지 않지만, 단어 사이에 하이픈(-)을 사용하는 방식이다. (예: my-variable-name) - java에서는 사용되지 않음.

  public static void main(String[] args) {
    // main 메소드는 자바 프로그램의 진입점(entry point)이다.
    // 프로그램이 실행될 때, JVM이 main 메소드를 호출하여 프로그램을 시작한다.
    // public class: 클래스가 어디서든 접근 가능하도록 허용한다.
    // static: main 메소드는 클래스의 인스턴스를 생성하지 않고도 호출할 수 있도록 한다.
    // void: main 메소드는 반환값이 없음을 나타낸다.
    // main String[] args: 자바가 가장 먼저 찾아 실행하는 약속된 이름의 메서드이다.
    // System.out.println()은 콘솔에 메시지를 출력하는 메소드이다.

    System.out.println("Hello, World!");
    // System.out.println()은 콘솔에 메시지를 출력하는 메소드이다.
    // "Hello, World!"는 출력할 문자열이다.
    
  }
}
