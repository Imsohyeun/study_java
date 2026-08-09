package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {
        
        //키보드에서 값을 받기위한 Scanner 객체
        Scanner sc = new Scanner( System.in );
        
        System.out.print("정수 : ");
        //println은 출력시 정수 : 옆에 바로못쓰는데 ln삭제하면 옆에 쓸수잇음
        int n = sc.nextInt();
        System.out.println("값 : " + n);

       System.out.println("문자열");
       String s = sc.next();
       System.out.println("값 : " + s);
    }//main
    
}//class
