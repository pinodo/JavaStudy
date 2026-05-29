package ex04_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {
    // 2개의 스레드만 사용하는 풀 생성
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    // 5개의 작업 제출
    for (int i = 1; i <= 10; i++) {
      int taskId = i;
      // execute(): 스레드 풀에 작업 전달
      executorService.execute(() -> {
        String name = Thread.currentThread().getName();
        System.out.println("[작업 " + taskId + "] 실행 중: " + name);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }

    // 종료 (반드시 필요)
    executorService.shutdown();
  }
}
