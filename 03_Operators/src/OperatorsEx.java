import java.util.Scanner;

public class OperatorsEx {
  public static void main(String[] args) {
    // 6. Bitwise AND operator example
    boolean isEven = false;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println(num & 1);
    if ((num & 1) == 0) {
      isEven = true;
    }
    System.out.println(num + " is even: " + isEven);

    // 9. Bit Masking example
    System.out.print("Enter a number: "); // all output will be 0
    int num2 = scanner.nextInt();
    System.out.println(num2 & 0);

    // 10. Bit Masking example - Leave 4 bits from the last
    int data = 255;
    System.out.print("Enter a mask value: "); // input: 15 -> output: 15 (11111111 & 00001111 -> 00001111)
    int num3 = scanner.nextInt();
    System.out.println(data & num3);
  }
}
