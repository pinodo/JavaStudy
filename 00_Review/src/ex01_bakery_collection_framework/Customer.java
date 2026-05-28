package ex01_bakery_collection_framework;

import java.util.Map;

public class Customer {
  
  private int buyBread; // 구매한 빵의 갯수
  private int money; // 고객이 가진 돈

  public Customer(int buyBread, int money) {
    this.buyBread = buyBread;
    this.money = money;
  }

  public int getBuyBread() {
    return buyBread;
  }

  public void setBuyBread(int buyBread) {
    this.buyBread = buyBread;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  /**
   * 
   * @param bakery 구매할 빵집
   * @param count 구매하려는 빵의 갯수
   * @param money 구매할 때 낼 돈
   * @throws InsufficientBudgetException 구매할 돈이 부족한 경우
   */
  public void buy(Bakery bakery, int count, int money) {
    try {
      if (this.money < money) {
        throw new InsufficientBudgetException("내가 가진 돈이 부족합니다.(" + (money - this.money) + "원 부족)");
      }

      Map<String, Integer> change = null;

      if (bakery != null) {
        change = bakery.sell(money, count);
        this.buyBread += count;
        this.money -= bakery.getPrice() * count;
      }
      
      if (change != null) {
        System.out.println(change.values());
      }

    } catch (InsufficientBudgetException e) {
      System.err.println(e.getMessage());
    }
  }
}
