package ex10_innerClass;

class Outer {
  private String msg = "인스턴스 메시지";
  private static String staticMsg = "정적 메시지";

  class Inner {
    void print() {
      System.out.println(msg);
      System.out.println(staticMsg);
    }
  }
}
