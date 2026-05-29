package ex03_synchronization.with_synchronization_wait_notify;

public class SharedBufferMain {
  public static void main(String[] args) {
    SharedBuffer buffer = new SharedBuffer();

    // 생산자: 10개 생산
    new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        try {
          buffer.produce("데이터-" + i);
        } catch (InterruptedException e) {
          e.getStackTrace();
        }
      }
    }).start();

    // 소비자: 10개 소비
    new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        try {
          buffer.consume();
          Thread.sleep(300);
        } catch (InterruptedException e) {
          e.getStackTrace();
        }
      }
    }).start();
  }
}
