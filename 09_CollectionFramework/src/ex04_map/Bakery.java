package ex04_map;

import java.util.HashMap;
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
   * @throws InsufficientPayAmountException
   * @throws InsufficientBreadException
   */
  public Map<String, Integer> sell(int money, int count) {
    Map<String, Integer> remains = new HashMap<>();

    return remains;

    // TRY_2
    // try {
    //   if (breadCount == 0) {
    //     throw new InsufficientBreadException("빵이 없습니다.");
    //   }
    //   if (price * count > money) {
    //     // throw new InsufficientPayAmountException("내가 가진 돈이 부족합니다. (" + (this.price * count - money) + "원 부족)");
    //     throw new InsufficientPayAmountException("돈 더 주세요.");
    //   }
    //   this.breadCount -= count;
    //   this.money += count * price;
    //   // remains.put(breadCount, money);
    //   remains = Map.of("count", count, "change", money - count * price);
    // } catch (InsufficientBreadException e) {
    //   System.err.println(e.getMessage());
    // } catch (InsufficientPayAmountException e) {
    //   System.err.println(e.getMessage());
    // }

    // return remains;

    // TRY_1
    // try {
    //   remains.put(getBreadCount() - count, getPrice() * count - money);
    //   System.out.println(remains.keySet());
    //   return remains;
    // } catch (InsufficientPayAmountException e) {
    //   System.err.println(e.getMessage());
    // } catch (InsufficientBudgetException e) {
    //   System.err.println(e.getMessage());
    // }
    // return remains;
  }
}
