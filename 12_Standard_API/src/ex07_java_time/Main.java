package ex07_java_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    
    // 현재 날짜와 시간
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    LocalDateTime current = LocalDateTime.now();
    ZonedDateTime local = ZonedDateTime.now();
    System.out.println("LocalDate: " + today);
    System.out.println("LocalTime: " + now);
    System.out.println("LocalDateTime: " + current);
    System.out.println("ZonedDateTime: " + local);

    // 특정 날짜와 시간 지정 (월을 1~12로 직관적으로 사용)
    LocalDate birthDay = LocalDate.of(1994, 1, 8);
    LocalTime wakeUp = LocalTime.of(7, 30, 0);
    System.out.println("Birthday: " + birthDay);
    System.out.println("Wakeup: " + wakeUp);

    // 기존 객체를 조작하지 않고, 새로운 객체를 반환
    LocalDate nextWeek = today.plusWeeks(1);
    LocalDate lastMonth = today.minusMonths(1);
    LocalDateTime nextYear = current.plusYears(1).withMonth(1); // 메서드 체이닝 가능
    System.out.println("Nextweek: " + nextWeek);
    System.out.println("Lastmonth: " + lastMonth);
    System.out.println("Nextyear: " + nextYear);

    int year = today.getYear(); // 2026
    Month month = today.getMonth(); // Month 열거형 반환 (JUN)
    int monthValue = today.getMonthValue(); // 1~12 반환 (6)
    int day = today.getDayOfMonth(); // 28
    boolean isBefore = birthDay.isBefore(today); // 오늘보다 이전인지 확인
    System.out.println("Year: " + year + ", Month: " + month + "(" + monthValue + "), Day: " + day);
    System.out.println("Birthday is before " + today + ": " + isBefore);

    // 날짜 차이 계산 (년, 월, 일 단위)
    Period period = Period.between(birthDay, today);
    System.out.println(period.getYears() + "살 입니다.");

    // 시간 차이 계산 (초, 나노초 단위)
    Instant start = Instant.now();
    for (int i = 0; i < 100000000; i++) {}
    Instant stop = Instant.now();
    Duration duration = Duration.between(start, stop);
    System.out.println(duration.toMillis() + "밀리초 소요되었습니다.");

    LocalDateTime now2 = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");

    // 날짜 -> 문자열
    String formatted = now2.format(formatter);
    System.out.println("날짜->문자열: " + formatted);

    // 문자열 -> 날짜
    LocalDateTime parsed = LocalDateTime.parse("2026년 05월 28일 22:30:00", formatter);
    System.out.println("문자열->날짜: " + parsed);
  }
}
