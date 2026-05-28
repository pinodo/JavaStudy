package ex01_bakery_collection_framework;

public class BakeryMain {
  public static void main(String[] args) {
    
    Customer customer = new Customer(0, 10000);

    Bakery bakery1 = new Bakery(100, 1000, 10000);
    Bakery bakery2 = new Bakery(50, 3000, 10000);

    customer.buy(bakery1, 3, 10000); // 구매 성공
    customer.buy(bakery2, 3, 7000); // 구매 실패
    customer.buy(bakery2, 2, 10000); // 구매 실패
    customer.buy(bakery2, 2, 7000); // 구매 성공

    System.out.println(bakery1.getBreadCount() + ", " + bakery1.getMoney());
    System.out.println(bakery2.getBreadCount() + ", " + bakery2.getMoney());
    System.out.println(customer.getBuyBread() + ", " + customer.getMoney());

    /* 실행 예시

    돈 더 주세요.
    내가 가진 돈이 부족합니다.(3000원 부족)
    97, 13000
    48, 16000
    5, 1000

    */
  }
}
