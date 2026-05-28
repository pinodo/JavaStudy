package ex02_travel_interface;

public class JejuTour extends Domestic implements Travel {
  public JejuTour() {
    super();
  }

  @Override
  public void sightseeing() {
    System.out.println("제주 여행하기.");
  }

  public void food() {
    System.out.println("옥돔 먹기.");
  }
}
