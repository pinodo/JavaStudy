package ex01_bakery_collection_framework;
public class InsufficientPayAmountException extends RuntimeException {
  public InsufficientPayAmountException(String message) {
    super(message);
  }
}
