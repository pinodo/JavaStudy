package ex08_staticFactoryMethod;

class UserFactory {
  public static User newInstance(long uid, String username) {
    return new User(uid, username);
  }
}
