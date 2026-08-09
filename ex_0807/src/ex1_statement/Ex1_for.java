package ex1_statement;

public class Ex1_for {
    public static void main(String[] args) {

        // for문 : 특정 코드를 원하는 만큼 반복하고자 할때
        // for( 초기식; 조건식; 증감식; ){
        // 조건식이 참일 때 수행되는 영역
        // }
        // 초기식 -> 조건식 ->출력 -> 증감식 ->참이면 출력 거짓이면 종료
        // * 초기식은 없을 수 있다
        // int i = 10;//전역변수

        for (int i = 0; i <= 2; i++) {
            // i는 for문에서만 사용 가능한 지역변수
            System.out.println(i);

        } // for
        System.out.println("----------------");

        // 10~1까지 반복하는 for문

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            // for문은 IJKL 을 주로쓴다

        } // for
        System.out.println("---------------");

        // 1~100까지 반복하는 for문을 만들되
        // 5의 배수만 출력

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------");

        for (int i = 5; i <= 100; i += 5) {

            System.out.println(i);

        } // for
    }// main

}
