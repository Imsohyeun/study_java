package ex1_string;

public class Ex2_String {
    public static void main(String[] args) { 
        
        String str = "Hong Gil Dong";
        int index = str.length(); //소괄호가 있으면 '메서드'다 //많이쓰임
        System.out.println("str의 길이 : "+ index);

        index = str.indexOf('G'); //홍길동에서 첫번째 G가 5번째로 나옴
        System.out.println("맨 처음 문자 G의 위치 : " + index);

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index);

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1,6);//1번째 위치부터 6번째위치 앞까지 나옴
        System.out.println("잘라낸 문장 : " + ss);

        String apple = "apple"; 
        //equals는 대소문자까지 동일해야만 같은값으로 인정
        if( apple.equals( "apple" ) ){//String은 꼭 equals를 넣어야한다 //많이쓰임
            System.out.println("사과");
        }
        
        if( apple.equalsIgnoreCase("apple") ){ //프로젝트 끝날때까지 주로 쓰이는 코드다 //많이쓰임
            System.out.println("대소문자 상관없이 사과");
            }

            String password = " 1234";
           String pwd2 = password.trim(); //trim = 앞,뒤의 의미없는 공백은 다 지워준다
           //trim()을 통해 문자열 앞 뒤의 의미없는 공백을 제거
           System.out.println(pwd2 + "의 길이 : " + pwd2.length()); 

           //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드 //많이쓰임
           String number = "100";
           int num = Integer.parseInt( number );//String보다 더 많이 쓰임
           System.out.println( num + 1);

           //기본자료형의 Wrapper클래스
           //boolean -> Boolean
           //char -> Character
           //byte -> Byte
           //short -> Short
           //int -> Integer
           //long ->Long
           //float -> Float
           //double -> Double




    }//main
}
