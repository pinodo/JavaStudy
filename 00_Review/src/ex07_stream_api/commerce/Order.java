package ex07_stream_api.commerce;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;

@Getter
public class Order {
    private Long id;
    private String customerName;
    private String status;      // "결제완료", "배송중", "배송완료", "취소"
    private int totalAmount;
    private LocalDate orderDate;
    private List<String> items; // 주문한 상품 이름들

    public Order(Long id, String customerName, String status, int totalAmount, LocalDate orderDate, List<String> items) {
        this.id = id;
        this.customerName = customerName;
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.items = items;
    }

    public static List<Order> getSamples() {
        return List.of(
            new Order(1L, "김철수", "배송완료", 125000, LocalDate.of(2024, 1, 5), List.of("노트북 케이스", "마우스")),
            new Order(2L, "이영희", "배송중", 59000, LocalDate.of(2024, 1, 10), List.of("청바지")),
            new Order(3L, "박민준", "결제완료", 980000, LocalDate.of(2024, 1, 15), List.of("스마트폰", "케이스")),
            new Order(4L, "김철수", "취소", 29000, LocalDate.of(2024, 1, 8), List.of("티셔츠")),
            new Order(5L, "최수진", "배송완료", 4500, LocalDate.of(2024, 1, 3), List.of("사과", "바나나")),
            new Order(6L, "정태양", "배송중", 250000, LocalDate.of(2024, 1, 12), List.of("헤드폰")),
            new Order(7L, "이영희", "배송완료", 45000, LocalDate.of(2024, 1, 1), List.of("후드티")),
            new Order(8L, "박민준", "취소", 3000, LocalDate.of(2024, 1, 9), List.of("사과"))
        );
    }
}