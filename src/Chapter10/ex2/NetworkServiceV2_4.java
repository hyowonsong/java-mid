package Chapter10.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " +
                    e.getMessage());
        }
        //NetworkClientException 이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        // 이걸 아예 밖으로 빼버려서 예외 처리가 끝난 다음에 정상 흐름의 마지막에 처리
        client.disconnect();
    }
}
