package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
  public static void main(String[] args) {
    /*  다음 점수를 List에 저장한 뒤, 총합과 평균(소수 자리 출력)을 출력하세요.
     { 85, 92, 78, 100, 95 }
     [출력 예시]
     점수 리스트: [85, 92, 78, 100, 95]
     총점: 450
     평균 점수: 90.0
     */ 
    List<Integer> grades = new ArrayList<>();
    grades.add(85);
    grades.add(92);
    grades.add(78);
    grades.add(100);
    grades.add(95);

    int sum = 0;
    for (int grade : grades) {
      sum += grade;
    }
    System.out.println("점수 리스트: " + grades);
    System.out.println("총점: " + sum);
    System.out.println("평균 점수: " + (double) sum / grades.size());
  }
}
