package ex03_set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 생성자 (Constructor)
@AllArgsConstructor

// Getter
@Getter

// Setter
@Setter

// toString()
@ToString

// equals() and hashCode()
@EqualsAndHashCode
public class Member {
    private String name;
    private int age;
}
