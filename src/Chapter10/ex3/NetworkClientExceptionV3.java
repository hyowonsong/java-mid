package Chapter10.ex3;

// 예외를 단순히 오류 코드로 분류하는 것이 아니라, 계층화해서 다양하게 만들면 더 세밀하게 예외처리가 가능하다.
public class NetworkClientExceptionV3 extends Exception {
    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
