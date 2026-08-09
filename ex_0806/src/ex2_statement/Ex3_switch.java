package ex2_statement;

public class Ex3_switch {
    public static void main(String[] args) {

        char name = '홍';

        switch( name ){//비교값

            case '김'://조건값
                System.out.println("1000만");
              //break

            case '이':
                System.out.println("730만");
                //break
              
            case '박':
                System.out.println("419만");
              //break

            default:
                System.out.println("데이터가 없습니다");
            //break
//break가 없으면 그 줄들은 다 출력된다
//보통은 break안뺀다
//int, String, char 만쓴다

        }//switch

    }//main
    
}//class
