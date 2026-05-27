package ex02_overrideEx.coffee_ex;

public class Carrier {
  
  private Cup[] cups = new Cup[4];
  private int idx = 0;

  public void addCup(Coffee cup) {
    if (idx != cups.length) {
      cups[idx++] = new Cup(cup);
    } else {
      System.out.println("컵이 꽉 찼습니다.");
      return;
    }
  }
  
  public void info() {
    for (Cup cup : cups) {
      System.out.println(cup == null ? "비어있음" : cup.getCoffee().getName());
    }
  }
}
