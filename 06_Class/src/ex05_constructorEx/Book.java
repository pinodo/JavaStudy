package ex05_constructorEx;

public class Book {
  private String title;
  private String author;
  private int price;
  private boolean isBorrowed;
  
  public Book(String title, String author, int price, boolean isBorrowed) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isBorrowed = isBorrowed;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isBorrowed() {
    return isBorrowed;
  }

  public void setBorrowed(boolean isBorrowed) {
    this.isBorrowed = isBorrowed;
  }

  void borrow() {
    if (!isBorrowed) {
      System.out.println("[" + title + "]을(를) 대출했습니다.");
      setBorrowed(true);
    } else {
      System.out.println("[" + title + "]은(는) 이미 대출 중입니다.");
      setBorrowed(false);
    }
  }

  void returnBook() {
    System.out.println("[" + title + "]을(를) 반납했습니다.");
    setBorrowed(false);
  }

  void display() {
    System.out.println("=== 도서 목록 ===");
    
  }
}
