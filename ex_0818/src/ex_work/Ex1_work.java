package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 값이 회문인지 판단 
        //------------------------------
        //입력 : abcba
        //abcba은(는) 회문입니다

        //입력 : abc
        //abc은(는) 회문이 아닙니다

            Scanner sc = new Scanner(System.in);
            System.out.print("입력 : ");

             //원본
            String str = sc.next();//abc

            StringBuffer sb = new StringBuffer(str);
            /* 
            
            */

             //원본은 뒤집어서 저장할 객체
            //String rev = "";//cba
            String rev = sb.reverse().toString(); 



            // for( int i = str.length()-1; i >= 0; i-- ){//int의 i가 -1
            //        rev += str.charAt(i);
            //        //str = "abc"
            //        //rev = "cba"

            // }//for
            
            if( str.equals(rev) ){ //str == rev 매우높은확률로 주소가 다름 안됨!! -> equals 써야함
                System.out.println(str + "은 회문");//회문 : 앞뒤가 똑같다

            }else{
                System.out.println(str + "은 안회문");
            }

    }//main
}
