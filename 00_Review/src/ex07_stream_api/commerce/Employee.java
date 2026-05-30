package ex07_stream_api.commerce;

import java.util.List;

import lombok.Getter;

@Getter
public class Employee {
    private Long id;
    private String name;
    private String department;  // "개발", "마케팅", "인사"
    private int salary;
    private int experienceYears;
    private String grade;       // "junior", "mid", "senior"

    public Employee(Long id, String name, String department, int salary, int experienceYears, String grade) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experienceYears = experienceYears;
        this.grade = grade;
    }

    public static List<Employee> getSamples() {
        return List.of(
            new Employee(1L, "김철수", "개발", 4500000, 5, "mid"),
            new Employee(2L, "이영희", "마케팅", 3800000, 3, "junior"),
            new Employee(3L, "박민준", "개발", 6000000, 8, "senior"),
            new Employee(4L, "최수진", "인사", 3500000, 2, "junior"),
            new Employee(5L, "정태양", "개발", 7200000, 12, "senior"),
            new Employee(6L, "한지민", "마케팅", 5100000, 6, "mid"),
            new Employee(7L, "오세훈", "인사", 4800000, 7, "mid"),
            new Employee(8L, "윤아름", "개발", 3200000, 1, "junior")
        );
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
                + ", experienceYears=" + experienceYears + ", grade=" + grade + "]";
    }
}