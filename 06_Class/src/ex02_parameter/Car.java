package ex02_parameter;

public class Car {

  // 값
  int oil;

  // 메서드(Method): 특정 기능을 수행하는 코드 블록

  // 결과타입 함수명(매개변수) { }

  /**
   * 메서드 설명을 작성
   * @param city 뭘 받는지 설명을 작성
   */
  void drive(String city) { // 매개변수 (Parameter)
    oil -= 10;
    System.out.println(city + "에서 드라이브 하기");
  }

  void goToGasStation(int fuel) {
    oil += fuel;
    System.out.println("현재 연료량: " + oil);
  }

}
