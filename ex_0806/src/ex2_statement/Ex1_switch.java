package ex2_statement;

public class Ex1_switch {
    public static void main(String[] args) {

        //switch-case믄
        //비교값과 조건값을 통해서 원하는 결과를 얻어내가 위한 제어문
        //특정 값을 바로 찾아서 실행하기 때문에 else-if에 비해 속도가 빠르다
        //스위치 문의 비교값으로는
        //1. 정수 (byte, short, int)
        //2. 문자열(String)
        //3. 문자(char)

        //switch( 비교값 ){
        // case 조건값:
        //     비교값과 조건값이 일치할 때 실행되는 영역
        // break;
        //}

        int n = 4;

        switch ( n ) {//비교값
        //중복되는 조건값으로는 실행이 안된다
            case 1://조건값
                System.out.println("게임시작");
                break;

            case 2:
                System.out.println("설정");
                break;   
            case 3:
                System.out.println("종료");
                break;   
                
              default:
                //비교값과 일치하는 조건값이 하나도 없을때
                //반드시 호출되는 영역
                System.out.println("올바른 값을 입력하세요");  

                //switch - 일치하는 값을한번에 찾아서 결론낸다, 범위값을 적지못한다..

        }//switch


    }// main

}
