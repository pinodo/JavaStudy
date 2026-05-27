package ex02_overrideEx.coffee_ex;

public class CoffeeMain {
  public static void main(String[] args) {
    Carrier carrier = new Carrier();
    carrier.addCup(new Coffee("espresso"));
    carrier.addCup(new Coffee("americano"));
    carrier.addCup(new Coffee("latte"));

    carrier.info();
  }
}
