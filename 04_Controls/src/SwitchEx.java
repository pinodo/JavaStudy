import java.util.Scanner;

public class SwitchEx {
  public static void main(String[] args) {
    // 월에 따른 계절 출력하기
    Scanner scanner = new Scanner(System.in);
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();
    switch (month % 12 / 3) {
      case 0:
        System.out.println("겨울");
        break;
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      default:
        System.out.println("잘못된 월입니다");
    }
  }
}
