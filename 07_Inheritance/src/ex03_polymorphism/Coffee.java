package ex03_polymorphism;

public class Coffee {

  private String coffeeBean;

  public Coffee(String coffeeBean) {
    this.coffeeBean = coffeeBean;
  }

  public void taste() {
    
  }

  // 커피 정보 출력 메서드
  public void info() {
    System.out.println("원산지: " + coffeeBean);
  }
  
}
