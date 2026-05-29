package ex02_runnable_interface.runnable_interface;

public class Main {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
  }
}
