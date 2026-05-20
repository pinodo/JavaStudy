public class OperatorsEx {
  public static void main(String[] args) {
    // 1. 별찍기
    String res = "";
    int n = 6;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        res += "*";
      }
      res += "\n";
    }
    System.out.println(res);
  }
}
