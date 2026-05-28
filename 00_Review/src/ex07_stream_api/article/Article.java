package ex07_stream_api.article;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Article {
  private String title;
  private int viewCount;
}
