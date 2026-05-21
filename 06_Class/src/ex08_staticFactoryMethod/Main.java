package ex08_staticFactoryMethod;

public class Main {
  public static void main(String[] args) {
    User user = UserFactory.newInstance(1L, "admin");
    user.print();
  }
}
