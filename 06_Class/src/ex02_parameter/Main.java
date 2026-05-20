package ex02_parameter;

public class Main {
  public static void main(String[] args) {
    
    // 객체 생성
    Car car = new Car();

    // 마침표(.) 연산자로 호출하기
    // 메서드로 전달하는 값: 인자(Argument)`₩
    
    car.goToGasStation(50);
    
    car.drive("속초");
    car.drive("강릉");

    System.out.println("현재 연료량: " + car.oil);

  }
}

클래스
  * 값(필드)과 기능(메서드)을 가지는 코드 블록
객체
  * 클래스를 바탕으로 메모리에 실제로 생성된 객체
  * 클래스에 정의되어 있는 값(필드)과 기능(메서드)을 사용할 수 있음

