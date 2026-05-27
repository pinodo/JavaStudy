package ex02_overrideEx.coffee_ex;

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
