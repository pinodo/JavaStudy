package ex03_polymorphism;

// 다형성: 하나의 타입으로 여러 객체를 관리하는 성질
// 부모 타입으로 자식 객체를 관리할 수 있다

public class Main {
  public static void main(String[] args) {

    // UpCasting (자식 -> 부모 형변환)
    Coffee coffee1 = new Espresso("브라질");
    Coffee coffee2 = new Americano("니카라과");

    // 1. 코드 작성 시 -> coffee의 taste() 연결 (정적 바인딩)
    // 2. 실행 시 -> 실제 객체의 taste()와 연결 (동적 바인딩)
    coffee1.taste();
    coffee2.taste();
    
    coffee1.info();
    coffee2.info();

    // DownCasting -> 직접 명시해야됨. Espresso 타입으로 강제 변환
    // 타입이 맞는지 체크하는 것이 권장사항: 타입 체크 연산자 instanceof 사용

    // coffee1 객체가 Espresso 타입이 맞다면, 타입을 변환하라.
    if (coffee1 instanceof Espresso) {
      ((Espresso)coffee1).drink();
    }
  }
}
