public class VariableEx {
  public static void main(String[] args) {
    // 6가지 기본 타입 (boolean, byte, int, long, double, char)
    boolean hasPen = true;
    byte a = 127;
    int b = 32;
    long c = 2222222222222222222L;
    double d = 3.14;
    char e = 'A';
    System.out.println(hasPen);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);

    // 문자열 타입 (String)
    String str1 = "Hello, World!";
    System.out.println(str1);

    // 자동 형 변환
    int n1 = 10;
    long n2 = n1; // int에서 long으로 자동 형 변환
    System.out.println(n2);


    // 강제 형 변환
    double d2 = 3.14;
    int n3 = (int) d2; // double에서 int로 강제 형 변환
    System.out.println(n3);

    double d3 = 1.9;
    long l1 = (long) d3;
    System.out.println(l1);

    int iNum = 48;
    char ch1 = (char) iNum;
    System.out.println(iNum);
    System.out.println(ch1);

  }
}
