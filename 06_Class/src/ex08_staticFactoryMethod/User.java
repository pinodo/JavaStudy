package ex08_staticFactoryMethod;

class User {
  public long uid;
  public String username;

  public User(long uid, String username) {
    this.uid = uid;
    this.username = username;
  }

  public void print() {
    System.out.println("uid= " + uid + ", username=" + username);
  }
}
