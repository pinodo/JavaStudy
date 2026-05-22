package ex02_overrideEx;

public class Bus {
  Seat[] seats;
  int numOfPerson = 0;

  // public Bus(int numOfPerson) {
  //   this.numOfPerson = numOfPerson;
  // }
  public Bus(int limit) {

    // 배열 초기화
    seats = new Seat[limit];
    // ... 작성
  }

  // public void on(Person person) {
  //   if (numOfPerson == seats.length - 1) {
  //     System.out.println("만석입니다. 다음 버스를 이용해 주세요.");
  //   } else {
  //     seats[numOfPerson] = new Seat(person);
  //     System.out.println(numOfPerson + "번 좌석 : " + person.getName() + " 탑승 완료");
  //   }
  // }
  public void on(Person person) {

  }

  public void off(int abc) {

  }

}
