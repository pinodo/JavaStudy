package ex04_map;

import java.util.HashMap;
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
   * @param bakery // 구매할 빵집
   * @param count  // 구매하려는 빵의 갯수
   * @param money  // 구매할 때 낼 돈
   * @throws InsufficientBudgetException // 구매할 돈이 부족한 경우
   */
  public void buy(Bakery bakery, int count, int money) {

    try {
      if (this.money < money) { // 낼 돈이 부족한 경우
        throw new InsufficientBudgetException("내가 가진 돈이 부족합니다.(" + (money - this.money) + "원 부족)");
      }

      Map<String, Integer> breadNChange = null;

      // 구매 처리 (손님이 살 빵의 갯수와 돈 총합을 bakery.sell()로 보냄 -> 빵이 부족하지 않음 && 고객이 낸 돈이 충분함 ->
      // return값: Map.of(K1("count"), V1(count), K2("change"), V2(CHANGE)) )
      if (bakery != null) {
        breadNChange = bakery.sell(money, count);
      }

      // 구매 처리가 됨 -> 손님이 산 빵 갯수, 손님의 돈 조정
      if (breadNChange != null) {
        this.buyBread += breadNChange.get("count");
        this.money -= (money - breadNChange.get("change"));
      }
    } catch (InsufficientBudgetException e) {
      System.err.println(e.getMessage());
    }

    // TRY_3
    // if (this.money < money) {
    // throw new InsufficientBudgetException("내가 가진 돈이 부족합니다.(" + (money -
    // this.money) + "원 부족)");
    // }

    // Map<String, Integer> remains = new HashMap<>();
    // if (bakery != null) {
    // remains = bakery.sell(money, count);
    // }

    // if (remains != null) {
    // this.buyBread += count;
    // this.money -= money;

    // }

    // TRY_2
    // try {
    // if (bakery.getPrice() * count > this.money) {
    // throw new InsufficientBudgetException("내가 가진 돈이 부족합니다. (" +
    // (bakery.getPrice() * count - money) + "원 부족)");
    // }
    // bakery.sell(money, count);
    // this.buyBread += count;
    // this.money -= bakery.getPrice() * count;
    // } catch (InsufficientBudgetException e) {
    // System.err.println(e.getMessage());
    // }

    // TRY_1
    // try {
    // if (bakery.getPrice() * count > money) {
    // throw new InsufficientBudgetException("돈 더 주세요.\n내가 가진 돈이 부족합니다.(" +
    // (bakery.getPrice() * count - money) + "원 부족)");
    // }
    // int remainBread = bakery.getBreadCount();
    // int remainMoney = bakery.getMoney();
    // bakery.setBreadCount(remainBread - count);
    // bakery.setMoney(remainMoney + money);
    // setMoney(this.money - money);
    // } catch (InsufficientBudgetException e) {
    // System.err.println(e.getMessage());
    // }
  }
}
