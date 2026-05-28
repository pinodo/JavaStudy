package ex07_stream_api.commerce;

import java.util.List;

import lombok.Getter;

@Getter
public class Product {
    private Long id;
    private String name;
    private String category;   // "전자기기", "의류", "식품"
    private int price;
    private double rating;     // 1.0 ~ 5.0
    private int stock;
    private boolean onSale;

    public Product(Long id, String name, String category, int price, double rating, int stock, boolean onSale) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.onSale = onSale;
    }

    public static List<Product> getSamples() {
        return List.of(
            new Product(1L, "노트북", "전자기기", 1200000, 4.5, 10, false),
            new Product(2L, "티셔츠", "의류", 29000, 3.8, 50, true),
            new Product(3L, "스마트폰", "전자기기", 950000, 4.7, 5, false),
            new Product(4L, "청바지", "의류", 59000, 4.1, 30, true),
            new Product(5L, "사과", "식품", 3000, 4.0, 100, false),
            new Product(6L, "헤드폰", "전자기기", 250000, 4.3, 0, true),
            new Product(7L, "바나나", "식품", 1500, 3.5, 200, false),
            new Product(8L, "후드티", "의류", 45000, 4.6, 20, false)
        );
    }

    @Override
    public String toString() {
      return String.format("Product{name='%s', price=%d, rating=%.1f, stock=%03d, sale=%b}", name, price, rating, stock, onSale);
    }
}