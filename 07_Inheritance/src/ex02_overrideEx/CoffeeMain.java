package ex02_overrideEx;

public class CoffeeMain {
  public static void main(String[] args) {
    Carrier carrier = new Carrier();
    carrier.addCup(new Coffee("espresso"));
    carrier.addCup(new Coffee("espresso"));
    carrier.addCup(new Coffee("espresso"));

    carrier.info();
  }
}
