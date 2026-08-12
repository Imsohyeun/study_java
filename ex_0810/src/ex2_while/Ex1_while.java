package ex2_while;

import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        
        //while문 : 간단한 구성을 가진 반복문
        //선 비교(조건식이 참인지 거짓인지 보는것) 후 처리

        //for(;;){

       // }//이렇게 무한반복 하지말기
       
        int num = 1;

        while ( num <= 4 ) {

            System.out.println(num);
            num++;
            
        }//while

        System.out.println("--------------------");

        Scanner sc = new Scanner(System.in);
        
        while (true) {//의도적으로 무한반복 시킬때 많다
            
        System.out.print("홀수 : ");
        int num2 = sc.nextInt();
        System.out.println(num2);

        }


    }//main
}
