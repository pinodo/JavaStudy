package ex07_stream_api.article;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Article> articles = Arrays.asList(
      new Article("환경", 100),
      new Article("문화", 200),
      new Article("정치", 300),
      new Article("경제", 400),
      new Article("날씨", 500)
    );

    List<String> titles = articles.stream()
      .filter(article -> article.getViewCount() >= 300)
      .map(article -> article.getTitle())
      .collect(Collectors.toList());

    System.out.println(titles);

    int totalViewCount = articles.stream()
      .mapToInt(Article::getViewCount)
      .sum();

    System.out.println("Total view: " + totalViewCount);

    
  }
}
