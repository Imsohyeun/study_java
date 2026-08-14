package ex1_string;

import java.util.Scanner;

public class Ex1_String {
    public static void main(String[] args) {

        // 대문자 시작이면 '클래스'다
        // String클래스의 두 가지 특징
        // 1) 객체 생성방법이 2가지( 암시적, 명시적 )
        // 2) 한 번 생성된 문자열의 내용은 변하지 않는다

        String s1 = "abc";// 암시적 객체생성
        String s2 = "abc";
        // 암시적 객체생성 String 밖에 없다
        String s3 = new String("abc"); // new 키워드가 들어가면 무조건 명시적 객체생성
        String s4 = new String("abc");

        // ==은 객체간 비교에서는 주소값 비교를 한다
        if (s1 == s3) {// s1 == s3 객체들 끼리의 값이아닌 주소를 비교한다
            System.out.println("주소가 같습니다");

        } else {
            System.out.println("주소가 다릅니다");
        }

        // String 클래스의 불변의 법칙
        String greet = "안녕";
        greet += "하세요";//가비지컬랙터
        System.out.println(greet);

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();
        // String끼리 == 로 절대 비교하지않는다 (본적도없음)
        if (op.equals("+")) {
            System.out.println("+연산 할게요");
        }

    }// main
}
