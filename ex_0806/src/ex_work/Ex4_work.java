package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //#연산자는 스캐너의 .next()를 사용하자
        //수1 : 10
        //수2 : 20
        //연산자 : +
        //10 + 20 = 30

        Scanner sc = new Scanner( System.in );
        
        System.out.print("수1 :");
        int su1 = sc.nextInt();
        
        System.out.println("수2");
        int su2 = sc.nextInt();

        System.out.println("연산자 : ");
        String op = sc.next();

        switch( op ){//비교값

            case"+"://조건값
            System.out.println(su1 + " + " + su2 +" = " + (su1 + su2));
              break;
            case"-"://조건값
            System.out.println(su1 + " - " + su2 +" = " + (su1 - su2));
              break;
            case"*"://조건값
            System.out.println(su1 + " * " + su2 +" = " + (su1 * su2));
              break;
            case"/"://조건값
            System.out.println(su1 + " / " + su2 +" = " + ((float)su1 / su2));
              break;

              default : 
              System.out.println("연산자 오류");

              break;


        }//switch


    }//main
    
}
