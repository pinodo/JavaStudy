package ex05_lambda;

public class Main {
  public static void main(String[] args) {
    
    MyInterface my = () -> System.out.println("나의 첫 람다식");
    my.method();

    // consumer: 인자 전달
    MyInterface2 my2 = name -> System.out.println(name + " 입니다.");
    my2.method("홍길동");

    // Supplier: 반환
    MyInterface3 my3 = () -> "김철수";
    my3.method();

    // Function: 인자 -> 반환
    Calculator calc = (a, b) -> a + b;
    System.out.println(calc.add(1, 2));

    // Predicate: 인자 -> boolean 반환
    MyInterface4 my4 = num -> num > 5;
    System.out.println(my4.method(7));

  }
}
