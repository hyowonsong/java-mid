package Chapter9.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException{
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
