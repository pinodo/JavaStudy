package ex04_map;

public class Customer {

  private int buyBread;
  private int money;
  
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
   * @param bakery
   * @param count
   * @param money
   * @throws InsufficientBudgetException
   */
  public void buy(Bakery bakery, int count, int money) {

    // TRY_2
    // try {
    //   if (bakery.getPrice() * count > this.money) {
    //     throw new InsufficientBudgetException("내가 가진 돈이 부족합니다. (" + (bakery.getPrice() * count - money) + "원 부족)");
    //   }
    //   bakery.sell(money, count);
    //   this.buyBread += count;
    //   this.money -= bakery.getPrice() * count;
    // } catch (InsufficientBudgetException e) {
    //   System.err.println(e.getMessage());
    // }

    // TRY_1
    // try {
    //   if (bakery.getPrice() * count > money) {
    //     throw new InsufficientBudgetException("돈 더 주세요.\n내가 가진 돈이 부족합니다.(" + (bakery.getPrice() * count - money) + "원 부족)");
    //   }
    //   int remainBread = bakery.getBreadCount();
    //   int remainMoney = bakery.getMoney();
    //   bakery.setBreadCount(remainBread - count);
    //   bakery.setMoney(remainMoney + money);
    //   setMoney(this.money - money);
    // } catch (InsufficientBudgetException e) {
    //   System.err.println(e.getMessage());
    // }
  }
}
