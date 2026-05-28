package ex02_travel_interface;

public class TravelMain {
  public static void main(String[] args) {
    Travel travel = new JejuTour();
    Domestic domestic = new JejuTour();
    travel.sightseeing();
    domestic.food();  
  }
}
