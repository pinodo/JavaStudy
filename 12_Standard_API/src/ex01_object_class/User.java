package ex01_object_class;

public class User {
  
  private int id;
  private String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // toString() 재정의: 객체 내부 데이터를 출력하기 위함
  // 객체의 문자 정보(디폴트: 클래스명@해시코드) 반환
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + "]";
  }

  // hashCode() 재정의: equals를 재정의하면 반드시 함께 재정의해야함
  // 객체를 식별하는 해시코드값을 반환
  // HashSet, HashMap등에서 객체를 구분할 때 필수적
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  // equals() 재정의: 주소가 달라도 id와 name이 같으면 같은 사용자로 인정
  // 두 객체가 물리적으로 같은지(주소값이 같은지) 비교
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    if (id != other.id)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
  
  
}
