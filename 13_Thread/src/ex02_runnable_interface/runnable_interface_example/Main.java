package ex02_runnable_interface.runnable_interface_example;

public class Main {
  public static void main(String[] args) {

    Runnable alphabetTask = () -> {
      for (char c = 'A'; c <= 'E'; c++) {
        System.out.println("[알파벳] " + c);
        try {
          Thread.sleep(500); // 0.5초간 일시 정지
        } catch (InterruptedException e) {
          e.getStackTrace();
        }
      }
    };

    // Thread 객체에 Runnable 주입
    Thread thread1 = new Thread(new TimeTask());
    Thread thread2 = new Thread(alphabetTask);

    // 멀티 스레드 시작
    System.out.println("=== 메인 스레드 시작 ===");
    thread1.start();
    thread2.start();
    System.out.println("=== 메인 스레드 종료 ===");
  }
}
