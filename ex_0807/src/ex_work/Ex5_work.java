package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
      //정수n1, n2를 입력받고
      //n1~n2 사이의 합을 출력
      //-------------------
      //수1 : 2
      //수2 : 5
      //결과 : 14

      //수1 : 5
      //수2 : 2
      //결과 : 14

      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();

      System.out.print("수2 :");
      int n2 =sc.nextInt();

      int res = 0;// 결과출력용 변수

      for( int i = n1; i <= n2; i++){

        res += i;

      }//for

      System.out.println("결과 : "+ res);
      


    }//main
    
}
