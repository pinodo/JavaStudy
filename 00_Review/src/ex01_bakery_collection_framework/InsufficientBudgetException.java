package ex01_bakery_collection_framework;

public class InsufficientBudgetException extends RuntimeException {
  public InsufficientBudgetException(String message) {
    super(message);
  }
}
