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
   * @throws InsufficientPayAmountException // 고객이 빵가격보다 적은 돈을 지불
   * @throws InsufficientBreadException // 판매할 빵의 갯수 부족
   */
  public Map<String, Integer> sell(int money, int count) {
    Map<String, Integer> remains = null;

    try {

      if (this.breadCount < count) { // 빵이 부족한 경우
        throw new InsufficientBreadException("빵이 없습니다.");
      }

      if (money < price * count) { // 고객이 낸 돈이 부족한 경우
        throw new InsufficientPayAmountException("돈 더 주세요.");
      }

      this.breadCount -= count; // 빵집에 빵 갯수 - 고객이 산 빵 갯수
      this.money += count * price; // 자본금 = 기존 자본금 + 고객이 산 빵 금액(갯수 * 가격)

      remains = Map.of("count", count, "change", money - count * price); // Immutable, 남은 빵 갯수, 잔돈 반환

    } catch (InsufficientBreadException e) {
      e.getMessage();
    } catch (InsufficientPayAmountException e) {
      e.getMessage();
    }
    return remains;

    // TRY_3
    // try {
    //   if (breadCount < count) {
    //     throw new InsufficientBreadException("빵이 없습니다.");
    //   }
    //   if (price > money) {
    //     throw new InsufficientPayAmountException("돈 더 주세요.");
    //   }
    //   this.money += price * count;
    //   this.breadCount -= count;
    //   remains = Map.of("count", count, "money", money - count * price);
    // } catch (InsufficientBreadException e) {
    //   e.getMessage();
    // } catch (InsufficientPayAmountException e) {
    //   e.getMessage();
    // }
    // return remains;

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
