package ex06_standard_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {

    executeConsumer("홍길동", name -> System.out.println(name));
    executeSupplier(() -> "Hello");
    executeFunction(12345, num -> num.toString());
    executePredicate("0123", pw -> pw == "1234");
  }
  

  public static void executePredicate(String param, Predicate<String> predicate) {
    if (predicate.test(param)) {
      System.out.println("반갑습니다!");
    } else {
      System.out.println("비밀번호가 틀렸습니다.");
    }
  }

  public static void executeFunction(Integer param, Function<Integer, String> function) {
    String res = function.apply(param);
    System.out.println("Function res: " + res);
  }

  public static void executeSupplier(Supplier<String> supplier) {
    String res = supplier.get();
    System.out.println("Supplier res: " + res);
  }

  public static void executeConsumer(String param, Consumer<String> consumer) {
    consumer.accept("Consumer res: " + param);
  }
}
