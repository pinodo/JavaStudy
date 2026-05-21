package ex01_extends;

public class WebDeveloper extends Developer {

  String webUrl;

  public WebDeveloper(String name, String skill) {
    super(name, skill);
  }

  public WebDeveloper(String name, String skill, String webUrl) {
    super(name, skill);
    this.webUrl = webUrl;
  }

  public void webDevelop() {
    System.out.println("웹 개발하기");
  }
}
