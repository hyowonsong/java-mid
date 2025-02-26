package Chapter10.ex4;

public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}