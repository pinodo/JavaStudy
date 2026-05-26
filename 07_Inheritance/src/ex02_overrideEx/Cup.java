package ex02_overrideEx;

public class Cup {

  private Coffee coffee;
  
  public Cup(Coffee coffee) {
    this.coffee = coffee;
  }

  public Coffee getCoffee() {
    return coffee;
  }

  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }

}
