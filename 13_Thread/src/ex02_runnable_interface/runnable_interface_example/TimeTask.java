package ex02_runnable_interface.runnable_interface_example;

public class TimeTask implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("[타이머] " + i + "초...");
      try {
        Thread.sleep(1000); // 1초간 일시 정지 (TIMED_WAITING)
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
