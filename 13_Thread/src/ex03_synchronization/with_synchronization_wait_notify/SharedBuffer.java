package ex03_synchronization.with_synchronization_wait_notify;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
  private final Queue<String> buffer = new LinkedList<>();
  private final int MAX_SIZE = 5;

  // 생산자: 버퍼가 가득 차면 wait
  public synchronized void produce(String data) throws InterruptedException {
    while (buffer.size() == MAX_SIZE) {
      System.out.println("[생산자] 버퍼 가득 참 -> wait");
      wait(); // 소비자가 notify할 때까지 대기
    }
    buffer.add(data);
    System.out.println("[생산자] 생산: " + data + " | 버퍼 크기: " + buffer.size());
    notifyAll();
  }

  // 소비자: 버퍼가 비면 wait
  public synchronized void consume() throws InterruptedException {
    while (buffer.isEmpty()) {
      System.out.println("[소비자] 버퍼 비어 있음 -> wait");
      wait(); // 생산자가 notify할 때까지 대기
    }
    String data = buffer.poll();
    System.out.println("[소비자] 소비: " + data + " | 버퍼 크기: " + buffer.size());
    notifyAll(); // 생산자 깨우기
  }
}
