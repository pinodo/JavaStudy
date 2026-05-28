package ex01_bakery_collection_framework;

public class InsufficientBreadCountException extends RuntimeException {
  public InsufficientBreadCountException(String message) {
    super(message);
  }
}
