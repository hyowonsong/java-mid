package Chapter10.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{
        // 1. 예외 처리 시작
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();

        // 2. 예외를 잡아서 처리해보자.
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();

        // 3. 정상, 예외 흐름을 분리하자 -> 하지만, 외부 연결과 같은 외부의 자원은 자동으로 해제되지 않는 문제 발생
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();

        // 4. disconnect()가 반드시 호출되게 처리 -> 하지만, catch에서 잡을 수 없는 예외가 발생할 때 문제가 생김
        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();

        // 5. finally 를 사용함으로써 예외를 밖으로 던지는 경우에도 서버 연결 해제에 성공
        //NetworkServiceV2_5 networkService = new NetworkServiceV2_5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
