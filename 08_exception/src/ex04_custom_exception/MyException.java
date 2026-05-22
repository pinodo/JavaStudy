package ex04_custom_exception;

// 실행 예외 만들기 (일반적인 상황)
// RuntimeException 상속 받기
// 생성 시점에 모든 필드가 채워지도록 구성 (생성자 필수)

public class MyException extends RuntimeException {

  private int errorCode;

  public MyException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }
}
