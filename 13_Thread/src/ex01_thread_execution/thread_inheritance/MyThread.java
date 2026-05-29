package ex01_thread_execution.thread_inheritance;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("My first thread");
  }
}
