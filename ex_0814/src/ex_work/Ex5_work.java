package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        //문장 : HelloWorld
        //결과  : Hlool

        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요 : ");
        String in = sc.next();

        String res = "";


        for( int i = 0; i < in.length(); i+=2){//i++ -> 코드 수 줄일려면 i +=2로하면 된다
            res += in.charAt(i);

        }//for

        System.out.println(res);


    }//main
}
