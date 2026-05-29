package ex03_synchronization.without_synchronization;

public class Counter {
  int count = 0;

  // 동기화가 없는 메서드
  public void increment() {
    count++;
  }
}
