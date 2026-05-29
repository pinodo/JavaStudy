package ex03_synchronization.with_synchronization;

public class Counter {
  int count = 0;

  // 한번에 한 스레드만 진입 가능: 임계 영역(Critical Section)
  public synchronized void increment() {
    count++;
  }
}
