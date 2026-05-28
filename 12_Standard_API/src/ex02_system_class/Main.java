package ex02_system_class;

import java.util.Arrays;

// System 클래스
// OS System과 관련된 기능을 제공하는 클래스
// java.lang 패키지 소속으로 별도 import가 필요 없음
// 모든 멤버가 static 처리되어 있어 System.멤버 형식으로 호출
// 예시: System.in, System.out

public class Main {

  public static void main(String[] args) {
    
    // 배열 복사
    int[] src = {10, 15, 20, 25, 30};
    int[] dest = new int[5];
    /**
     * arraycopy(src, srcPos, dest, destPos, length)
     * src: 원본 배열
     * srcPos: 원본에서 복사 시작할 인덱스 
     * dest: 붙여넣을 배열 
     * destPos: dest에서 붙여넣기 시작할 인덱스 
     * length: 복사할 요소 개수
     */
    System.arraycopy(src, 1, dest, 0, 4); // {15, 20, 25, 30, 0}
    System.out.println("Original array: " + Arrays.toString(src) + ", copied array: " + Arrays.toString(dest));

    // 현재 타임스탬프 조회
    long timestamp = System.currentTimeMillis();
    System.out.println("현재 시간: " + timestamp);

    // 경과 시간 측정 (정밀도가 높음)
    long startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {}

    long stopTime = System.nanoTime();
    long elapsedTime = stopTime - startTime;
    System.out.println("경과 시간: " + elapsedTime);
  }
}
