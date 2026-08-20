package ex02_work;

import java.util.Scanner; //공부하라고 준 문제 암호화 자랑 ㄴㄴ

public class EncodeMain {
    public static void main(String[] args) {
        
     //입력 : abc123
     //결과 : `~!wer

     Scanner sc = new Scanner(System.in);
     System.out.print("입력 : ");
     String str = sc.next();//암호화 되기 전 문자열 

     EncodeSub es = new EncodeSub();
     String res = es.encoding(str);

     System.out.println("결과 : " + res);

     

    }//main
}
