package Chapter10.ex2;

// 예외도 객체이다. 따라서, 필요한 필드와 메서드를 가질 수 있다.
// 체크 예외(Exception)
public class NetworkClientExceptionV2 extends Exception {
    // 필드
    private String errorCode;

    // 생성자
    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
