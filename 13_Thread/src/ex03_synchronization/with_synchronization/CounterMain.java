package ex03_synchronization.with_synchronization;

public class CounterMain {
  public static void main(String[] args) {
    Counter counter = new Counter();

    Runnable task = () -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
      }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();
    
    try {
      t1.join();
      t2.join();

      // 언제나 2000
      System.out.println("최종 결과: " + counter.count);
    } catch (InterruptedException e) {
      e.getStackTrace();
    }
  }
}
