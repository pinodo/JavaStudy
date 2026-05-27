package ex02_overrideEx.bus_ex;

public class Bus {
  Seat[] seats;
  int numOfPerson = 0;

  // public Bus(int numOfPerson) {
  //   this.numOfPerson = numOfPerson;
  // }
  public Bus(int limit) {

    // 배열 초기화
    seats = new Seat[limit];
  }

  /**
   * 버스 탑승. 빈 좌석 앞자리부터 채우기, 입석 금지
   * @param person
   */
  public void on(Person person) {
    if (numOfPerson == seats.length - 1) {
      System.out.println("만석입니다. 다음 버스를 이용해 주세요.");
    } else {
      for (int i = 0; i < seats.length; i++) {
        if (seats[i] == null) {
          seats[i] = new Seat(person);
          System.out.println(person.getName() + " 탑승 완료");
          return;
        }
      }
    }

  }

  /**
   * 버스 하차. 내리는 사람의 좌석 번호를 이용해서 하차
   * @param seatNum
   */
  public void off(int seatNum) {

    seats[seatNum - 1] = null;
  }

  /**
   * 버스 탑승 명단 출력
   */
  public void info() {
    for (int i = 0; i < seats.length; i++) {
      if (seats[i] != null) {
        System.out.println("0" + (i + 1) + "번 좌석 : " + seats[i].getPerson().getName());
      } else {
        System.out.println("0" + (i + 1) + "번 좌석 : 비어 있음");
      }
    }
  }

}
