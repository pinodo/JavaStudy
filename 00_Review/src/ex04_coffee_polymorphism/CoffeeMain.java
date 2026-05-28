package ex04_coffee_polymorphism;

public class CoffeeMain {
  public static void main(String[] args) {
    Carrier carrier = new Carrier(4);

    Cup cup1 = new Cup();
    Cup cup2 = new Cup();
    Cup cup3 = new Cup();

    cup1.setCoffee(new Americano("Ame_brazil"));
    cup2.setCoffee(new Espresso("Esp_guatemala"));
    cup3.setCoffee(new CafeLatte("Lat_hongkong"));

    carrier.addCup(cup1);
    carrier.addCup(cup2);
    carrier.addCup(cup3);

    // TRY_01 -> Cup을 재사용할 수 없음
    // carrier.addCup(new Cup(new Americano("Ame_brazil")));
    // carrier.addCup(new Cup(new Espresso("Esp_guatemala")));
    // carrier.addCup(new Cup(new CafeLatte("Lat_hongkong")));

    carrier.info();
  }
}
