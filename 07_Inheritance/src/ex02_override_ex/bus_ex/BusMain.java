package ex02_overrideEx.bus_ex;

public class BusMain {
  public static void main(String[] args) {
    Bus bus = new Bus(5);
    bus.on(new Person("톰"));
    bus.on(new Person("에릭"));
    bus.on(new Person("마이클"));
    bus.on(new Person("필립"));
    bus.on(new Person("조나단"));
    System.out.println("== 탑승 정보 출력 ==");
    bus.info();
    System.out.println("== 3번 좌석 하차 시 ==");
    bus.off(3);
    bus.info();
    System.out.println("== 새로운 탑승자가 3번 좌석에 착석 ==");
    bus.on(new Person("제시카"));
    bus.info();
  }
}