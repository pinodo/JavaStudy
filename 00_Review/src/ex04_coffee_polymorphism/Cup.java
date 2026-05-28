package ex04_coffee_polymorphism;

public class Cup {

  private Coffee coffee;

  public Cup() {}

  public Coffee getCoffee() {
    return coffee;
  }

  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
}
