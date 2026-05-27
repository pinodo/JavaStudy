package ex02_overrideEx.bus_ex;

public class Seat {

  private Person person;

  public Seat(Person person) {
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

}
