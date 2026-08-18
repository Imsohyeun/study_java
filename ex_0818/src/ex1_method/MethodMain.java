package ex1_method;

public class MethodMain {
    public static void main(String[] args) {

        MethodTest m1 = new MethodTest();
        m1.test1();

        int su = 100;
        int res = m1.test2(su);// () = 인자

        System.out.println("su : " + res);

    }// main
}
