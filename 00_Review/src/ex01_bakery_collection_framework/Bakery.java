package ex01_bakery_collection_framework;

import java.util.Map;

public class Bakery {

  private int breadCount; // 빵갯수
  private int price; // 빵가격
  private int money; // 자본금

  public Bakery(int breadCount, int price, int money) {
    this.breadCount = breadCount;
    this.price = price;
    this.money = money;
  }

  public int getBreadCount() {
    return breadCount;
  }

  public void setBreadCount(int breadCount) {
    this.breadCount = breadCount;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  /**
   * 
   * @param money 고객이 낸 돈
   * @param count 고객이 사려는 빵의 갯수
   * @return 판매할 빵의 갯수와 잔돈
   * @throws InsufficientBreadCountException 판매할 빵의 갯수 부족
   * @throws InsufficientPayAmountException  고객이 빵가격보다 적은 돈을 지불
   */
  public Map<String, Integer> sell(int money, int count) {

    Map<String, Integer> change = null;

    try {
      if (this.breadCount < count) {
        throw new InsufficientBreadCountException("빵이 부족합니다.");
      }
      if (money < this.price * count) {
        throw new InsufficientPayAmountException("돈 더 주세요.");
      }

      this.breadCount -= count;
      this.money += this.price * count;

      change = Map.of("count", count, "change", money - (this.price * count));

    } catch (InsufficientBreadCountException e) {
      System.err.println(e.getMessage());
    } catch (InsufficientPayAmountException e) {
      System.err.println(e.getMessage());
    }

    return change;
  }
}
