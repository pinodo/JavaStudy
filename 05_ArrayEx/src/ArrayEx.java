import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // Array: 여러 변수를 하나의 이름으로 정리
        // int a, b, c;
        // int[] arr;
        
        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int a = scanner.nextInt();

        // 배열 선언
        String[] blackPink;

        // 배열 생성
        blackPink = new String[a];

        // 배열 요소 (Element: 각 변수를 의미)
        blackPink[0] = "지수";
        blackPink[1] = "로제";
        blackPink[2] = "리사";
        blackPink[3] = "제니";

        // 배열 길이
        System.out.println("Array length: " + blackPink.length);

        // 출력
        for (int i = 0; i < blackPink.length; i++) {
            System.out.println(blackPink[i]);
        }

        // 정적 초기화 (배열 선언 시에만 가능한 초기화)
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};
        for (String season : seasons) {
            System.out.println(season);
        }

        // 동적 초기화 ()
        String[] hobbies;
        hobbies = new String[] {"lego", "read books", "play soccer"};
        for (String hobby: hobbies) {
            System.out.println(hobby);
        }

        // 배열의 길이는 수정 불가
        // 배열의 길이를 늘이는 방법: 새 배열을 만들어서 이사하기
        String[] names = {"KCS", "HKD"};
        String[] newArray = new String[5];
        System.arraycopy(names, 0, newArray, 0, 2);
        names = newArray;
        System.out.println(Arrays.toString(names));
    }
}
