package ex04_coffee_polymorphism;

public class Carrier {
  Cup[] cups;
  int idx = 0;

  public Carrier(int limit) {
    cups = new Cup[limit];
  }

  public void addCup(Cup cup) {
    if (idx > 3) {
      System.out.println("컵이 꽉 찼습니다.");
      return;
    } else {
      cups[idx++] = cup;
    }
  }

  public void info() {
    System.out.println("== 커피 정보 ==");
    for (int i = 0; i < cups.length; i++) {
      System.out.println(cups[i] == null ? (i+1) + ": 비어있음."  : (i+1) + ": " + cups[i].getCoffee().getName());
    }
  }
}
