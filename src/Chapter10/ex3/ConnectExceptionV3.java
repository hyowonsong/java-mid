package Chapter10.ex3;


// ConnectExceptionV3 : 연결 실패시 발생하는 예외이다. 내부에 연결을 시도한 `address` 를 보관한다.
public class ConnectExceptionV3 extends NetworkClientExceptionV3{
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
