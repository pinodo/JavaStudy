package ex04_abstract;

// 다형성: 하나의 타입으로 여러 객체를 관리하는 성질
// 부모 타입으로 자식 객체를 관리할 수 있다

public class Main {
  public static void main(String[] args) {

    // UpCasting (자식 -> 부모 형변환)
    Coffee coffee1 = new Espresso("브라질");
    Coffee coffee2 = new Americano("니카라과");

    if (coffee1 instanceof Espresso) {
      ((Espresso)coffee1).drink();
    }

    coffee2.taste();

    // 추상 클래스는 객체를 생성할 수 없다. 미완성 상태이기 때문에.
    // Coffee coffee3 = new Coffee("과테말라");

    // 미완성 된 추상 메서드를 만든다면, 객체를 생성할 수 있다.
    Coffee coffee3 = new Coffee("과테말라") {
       @Override
       public void taste() {
         // TODO Auto-generated method stub
        System.out.println("커피taste");
       }
    };
    coffee3.taste();
    coffee3.info();
  }
}
