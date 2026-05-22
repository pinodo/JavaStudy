package ex04_abstract;

public class Espresso extends Coffee {

  public Espresso(String coffeeBean) {
    super(coffeeBean);
  }

  @Override
  public void taste() {
    System.out.println("쓴맛");
  }

  // 에스프레소 정보 출력 메서드
  @Override
  public void info() {
    System.out.println("에스프레소");
    super.info(); // 부모의 메서드를 불러옴 (override 상위 -> override 하위)
  }

  // Coffee에는 없는(부모에는 없는) 에스프레소 전용 메서드
  public void drink() {
    System.out.println("에스프레소 마신다.");
  }

}
