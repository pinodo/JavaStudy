package ex05_interfaceEx;

public class JejuTour extends Domestic implements Travel {
  
  @Override
  public void food() {
    System.out.println("흑돼지 구이");
  }

  @Override
  public void sightseeing() {
    System.out.println("우도");
  }
}
