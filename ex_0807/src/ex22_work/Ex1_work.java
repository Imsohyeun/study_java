package ex22_work;

public class Ex1_work {

    public static void main(String[] args) {

        // 10~1까지 반복하는 for문

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        } // for

        System.out.println("------------");

        // 1~100까지 반복하는 for문을 만들되
        // 5의 배수만 출력

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            } // if
            
        } // for
        System.out.println("----------------");

        // 1~10까지의 정수들 중에서 홀수의 합만 계산하여 출력
        // ----------------------
        // 결과 : 25

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1 ){
                sum += i;

            }//if

        }//for

        System.out.println("결과: "+ sum);

 

    }// main

}
