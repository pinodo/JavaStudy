package ex03_bus_polymorphism;

public class BusMain {
  public static void main(String[] args) {
    Bus bus = new Bus(5);
    bus.on(new Person("톰"));
    bus.on(new Person("에릭"));
    bus.on(new Person("마이클"));
    bus.on(new Person("필립"));
    bus.on(new Person("조나단"));
    bus.on(new Person("제시카"));
    
    System.out.println("== 탑승 ==");
    bus.info();
    
    System.out.println("== 하차 ==");
    bus.off(3);
    bus.info();

    System.out.println("== 새로운 탑승자가 3번 좌석에 착석 ==");
    bus.on(new Person("제시카"));
    bus.info();
  }
}
