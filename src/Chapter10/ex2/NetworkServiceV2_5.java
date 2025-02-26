package Chapter10.ex2;

// finally 를 사용해서 반드시 호출되게 처리. 주로 try 에서 사용한 자원을 해제할 때 주로 사용
public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " +
                    e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
