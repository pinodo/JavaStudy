package ex05_constructor_ex;

public class Book {
  private String title;
  private String author;
  private int price;
  private boolean isBorrowed;
  
  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isBorrowed = false; // default값: false
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

  public void borrow() {
    if (isBorrowed) {
      System.out.println("[" + title + "]은(는) 이미 대출 중입니다.");
    } else {
      setBorrowed(true);
      System.out.println("[" + title + "]을(를) 대출했습니다.");
    }
  }

  public void returnBook() {
    if (!isBorrowed) {
      System.out.println("[" + title + "]은(는) 대출 중이 아닙니다.");
    } else {
      setBorrowed(false);
      System.out.println("[" + title + "]을(를) 반납했습니다.");
    }
  }

  void display() {
    System.out.println("제목: " + title);
    System.out.println("저자: " + author);
    System.out.println("가격: " + price);
    System.out.println("대출 상태: " + (isBorrowed ? "대출 중" : "대출 가능"));
    System.out.println("------------------");
  }
}
