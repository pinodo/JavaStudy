package ex01_thread_execution.thread_inheritance;

public class Main {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start(); // 스레드 실행 (run()을 직접 호출하지 않음)
  }
}
