import java.util.Scanner;

public class Operators_ex {
  public static void main(String[] args) {
    // 6. Bitwise AND operator example
    boolean isEven = false;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println(num & 1);
    if ((num & 1) == 0) { // This will cause a compilation error because & is a bitwise operator, not a logical operator. We should use % instead.
      isEven = true;
    }
    System.out.println(num + " is even: " + isEven);

    // 9. Bit Masking example
    
  }
}
