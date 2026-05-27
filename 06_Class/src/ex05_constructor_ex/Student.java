package ex05_constructor_ex;

public class Student {
  private String name;
  private int math;
  private int english;
  private int science;
  
  public Student(String name, int math, int english, int science) {
    this.name = name;
    this.math = math;
    this.english = english;
    this.science = science;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getEnglish() {
    return english;
  }

  public void setEnglish(int english) {
    this.english = english;
  }

  public int getScience() {
    return science;
  }

  public void setScience(int science) {
    this.science = science;
  }

  public double getAverage() {
    return (double) (math + english + science) / 3;
  }

  public char getGrade() {
    double avg = getAverage();
    if (avg >= 90) {
      return 'A';
    } else if (avg >= 80) {
      return 'B';
    } else if (avg >= 70) {
      return 'C';
    } else {
      return 'D';
    }
    // if (this.getAverage() > 90) {
    //   return 'A';
    // } else if (this.getAverage() > 80) {
    //   return 'B';
    // } else if (this.getAverage() > 70) {
    //   return 'C';
    // }
    //   else {
    //   return 'D';
    // }
  }

  public void display() {
    System.out.println("Info: " + name);
  }
}