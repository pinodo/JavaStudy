package ex07_stream_api.commerce;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommerceMain {
  public static void main(String[] args) {
    List<Product> products = Product.getSamples();

    // Product
    // 1. 카테고리별 그룹핑
    Map<String, List<Product>> groupByCategory = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory));
    groupByCategory.forEach((category, productAll) -> {
      System.out.println("\n[" + category + "]");
      productAll.forEach(System.out::println);
    });

    // 2. 가격 합산
    Integer totalPrice = products.stream()
        .mapToInt(Product::getPrice)
        .sum();
    System.out.println("Total price: " + totalPrice);

    // 3. 재고 없는 상품 필터
    List<Product> outOfStockProducts = products.stream()
        .filter(product -> product.getStock() == 0)
        .collect(Collectors.toList());
    System.out.println("Out of stock: " + outOfStockProducts);

    // 4. 평점 순 정렬
    List<Product> ascByRating = products.stream()
        .sorted(Comparator.comparingDouble(Product::getRating))
        .collect(Collectors.toList());
    ascByRating.forEach(product -> {
      System.out.println("[" + product.getRating() + "]");
      System.out.println(product.toString());
    });

    // Employee
    // 1. 부서별 평균 연봉

    // 2. 시니어만 필터

    // 3. 연봉 총합

    // 4. 이름만 추출

    // Order
    // 1. 취소 제외 총 매출

    // 2. 고객별 주문 횟수

    // 3. 날짜 범위 필터

    // 4. flatMap으로 전체 상품 목록 추출

  }
}
