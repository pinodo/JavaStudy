package ex07_stream_api.commerce;

/*

Stream 공부법

1단계 - 기본 구조 이해
stream() → 중간연산 → 최종연산
filter, map, forEach 먼저 익히기

2단계 - 중간연산 익히기
filter, map, flatMap, sorted, distinct

3단계 - 최종연산 익히기
collect, forEach, count, reduce

4단계 - Collectors 익히기
toList, toMap, groupingBy

<막힐 때>
1. https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
2. https://claude.ai/new

*/

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommerceMain {
  public static void main(String[] args) {
    List<Product> products = Product.getSamples();
    List<Employee> employees = Employee.getSamples();    
    List<Order> orders = Order.getSamples();    

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
    // 현재 부서별 총 금액만 나옴
    Map<String, Integer> averageSalaries = employees.stream()
      .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));
    System.out.println("=== 부서별 평균 연봉 ===");
    averageSalaries.forEach((key, value) -> {
      System.out.println("[" + key + "]: " + String.format("%,d", value));
    });

    // 2. 시니어만 필터
    List<Employee> seniorEmployees = employees.stream()
      .filter(grade -> grade.getGrade() == "senior")
      .collect(Collectors.toList());
    System.out.println("=== 시니어 사원 리스트 ===");
    seniorEmployees.forEach(employee -> System.out.println(employee));

    // 3. 연봉 총합
    Integer salaryTotal = employees.stream()
      .mapToInt(Employee::getSalary)
      .sum();
    System.out.println("=== 연봉 총합 ===\n" + String.format("%,d", salaryTotal));

    // 4. 이름만 추출
    List<String> nameList = employees.stream()
      .map(employee -> employee.getName())
      .collect(Collectors.toList());
    System.out.println("=== 사원 리스트 ===\n" + nameList);

    // Order
    // 1. 취소 제외 총 매출
    Integer revenueTotal = orders.stream()
      .filter(order -> order.getStatus() != "취소")
      .mapToInt(Order::getTotalAmount)
      .sum();
    System.out.println("=== 취소 제외 총 매출 ===\n" + revenueTotal);

    // 2. 고객별 주문 횟수
    Map<String, Integer> orderCount = orders.stream()
      .collect(Collectors.toMap(
        Order::getCustomerName,
        order -> 1,
        Integer::sum
      ));
    System.out.println("=== 고객별 주문 횟수 ===");
    System.out.println(orderCount);

    // 3. 날짜 범위 필터

    // 4. flatMap으로 전체 상품 목록 추출
    
  }
}
