package Chapter8.nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        // 여기에서 InnerClass 의 hello() 메서드를 호출해라.
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
