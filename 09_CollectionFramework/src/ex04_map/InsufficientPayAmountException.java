package ex04_map;

public class InsufficientPayAmountException extends RuntimeException {

  public InsufficientPayAmountException(String message) {
    super(message);
  }
}
