package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
        
        //저의 나이는 20살 입니다
        int age = 20;
        System.out.printf( "저의 나이는 %d살 입니다\n", age);

        //저는 20살이고 3층에 살아요
    System.out.printf( "저는 %d살이고 %02d층에 살아요\n", 20,3 );

        //나는 박씨야
        System.out.printf( "나는 %c씨야\n",'박' );

        //나는 a형이야
        System.out.printf("나는 %C형이야\n",'a');

        //원주율은 : 3.141592
        System.out.printf("원주율 : %.2f\n",3.141592);
        //%.2f 소수점 두자리까지만 나오게하는것

        //저는 홍길동 입니다
        
        System.out.printf("저는 %s입니다\n","홍길동");

        System.out.printf("%s\t %d\t %d\n","김윤", 100, 95);
        System.out.printf("%s\t %d\t %d\n","김길동", 100, 30);

        //오늘 강수량은 15%입니다
        System.out.printf("오늘 강수량은 %d%%입니다\n",15);
    }//main
    
    /*
    formatter의 문법
    \n : 강제개행(줄바꿈)
    %d : 정수
    %02d : 자릿수 맞추기
    %c : 문자
    %f : 실수 아래의 두자리 수까지 표시
    %s : 문자열
    \t : Tab, 라인정리
    \\ , \": \뒤에나오는 문자가 나온다(\출력,"출력) @가인씨 
    %%: %특수문자 나오기위해 %두번눌려야함

    */
}
