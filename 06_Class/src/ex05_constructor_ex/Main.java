package ex05_constructor_ex;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. 도서 대여 프로그램
         */
        Book[] books = new Book[3];

        books[0] = new Book("자바의 정석", "남궁성", 30000);
        books[1] = new Book("이펙티브 자바", "조슈아 블로크", 36000);
        books[2] = new Book("클린 코드", "로버트 C. 마틴", 32000);

        // 최초 도서 목록
        System.out.println("=== 도서 목록 ===");
        for (Book book : books) {
            book.display();
        }

        // 대출/반납 시뮬레이션
        System.out.println("=== 대출/반납 시뮬레이션 ===");
        books[0].borrow();
        books[0].borrow();
        books[1].borrow();
        books[0].returnBook();
        books[2].returnBook();

        // 최종 도서 목록
        System.out.println(" === 최종 도서 목록 ===");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                book.display();
            }
        }

        /**
         * 2. 도형 넓이, 둘레 계산 프로그램 (Inner Class)
         */
        Rectangle r1 = new Rectangle("내 사각형", 5, 4);
        Circle c1 = new Circle("내 원", 5.5);

        // 도형 정보
        System.out.println("=== 도형 정보 ===");
        r1.display();
        System.out.println("-------------------");
        c1.display();
        System.out.println("-------------------");
    }
}
