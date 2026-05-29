package ex03_synchronization.with_synchronization_wait_notify;

public class SharedData {
  private String data;
  private boolean isEmpty = true;

  // 소비자용 메서드
  public synchronized void consume() {
    while (isEmpty) {
      try {
        System.out.println("[소비자] 창고가 비었습니다. 대기합니다...");
        wait();
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
    }
    System.out.println("[소비자] 데이터를 소비함: " + data);
    isEmpty = true;
    notify(); // 생산자를 깨움
  }

  // 생산자용 메서드
  public synchronized void produce(String newData) {
    while (!isEmpty) {
      try {
        System.out.println("[생산자] 창고가 가득 찼습니다. 대기합니다...");
        wait();
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
    }
    this.data = newData;
    isEmpty = false;
    System.out.println("[생산자] 데이터를 생산함: " + newData);
    notify(); // 기다리는 소비자를 깨움 (RUNNABLE로 이동)
  }
}
