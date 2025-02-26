package Chapter10.ex4;

// 언체크 예외로 예외를 잡지 않고 던져버린다.
// 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다. -> 깔끔해진다.
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
