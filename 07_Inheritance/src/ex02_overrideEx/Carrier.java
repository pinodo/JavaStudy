package ex02_overrideEx;

public class Carrier {
  
  private Cup[] cups;
  private int idx = 0;

  public void addCup(Cup cup) {
    if (idx != cups.length) {
      cups[idx++] = cup;
    } else {
      System.out.println("컵이 꽉 찼습니다.");
      return;
    }
  }
  
  public void info() {
    
  }
}
