package ex03_bus_polymorphism;

public class Bus {
  
  private Seat[] seats;
  private int numOfPerson = 0; // 만석 확인할 때 씀

  public Bus(int limit) {
    seats = new Seat[limit];
  }

  // 버스 탑승. 빈 좌석 앞자리부터 채우기, 입석 금지
  public void on(Person person) {
    if (numOfPerson == seats.length) {
      System.out.println("만석입니다. 다음 버스를 이용해 주세요.");
    }

    for (int i = 0; i < seats.length; i++) {
      if (seats[i] == null) {
        seats[i] = new Seat(person);
        numOfPerson++;
        return;
      }
    }
  }

  // 버스 하차. 내리는 사람의 좌석 번호를 이용해서 하차
  public void off(int seatNum) {
    if (seatNum < 1 || seatNum > seats.length - 1) {
      System.out.println("잘못된 좌석 정보입니다.");
      return;
    }
    seats[seatNum - 1] = null;
    numOfPerson--;
  }

  // 버스 탑승 명단 출력
  public void info() {
    for (int i = 0; i < seats.length; i++) {
      System.out.println(seats[i] == null ? "0" + (i + 1) + "번 좌석 : 비어 있음"  : "0" + (i + 1) + "번 좌석 : " + seats[i].getPerson().getName());
    }
  }
}
