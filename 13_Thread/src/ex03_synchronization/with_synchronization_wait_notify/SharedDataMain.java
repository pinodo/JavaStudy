package ex03_synchronization.with_synchronization_wait_notify;

public class SharedDataMain {
  public static void main(String[] args) {
    // 공유 데이터
    SharedData shared = new SharedData();

    // 소비자를 먼저 실행 (데이타가 없어서 wait 할 것임)
    new Thread(shared::consume).start();

    new Thread(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
      shared.produce("공유 데이터");
    }).start();
  }
}
