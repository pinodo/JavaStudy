package ex09_singleton;

class Singleton {
  private static Singleton instance;

  private Singleton() {} // 외부에서 new를 사용하지 못하도록 private 생성자 선언

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
