package Chapter3.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 쌍타옴표를 사용하던, 객체를 사용하던 똑같다.
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
