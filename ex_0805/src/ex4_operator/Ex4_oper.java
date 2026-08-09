package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {

     //증감연산자
     //1씩 증가시키거나 1씩 감소시키는 연산자
     //선행증감(++a)과 후행증감(b++)의 차이를 알고있어야 한다
     int a = 10;
     System.out.println("a : " + ++a);
     
     int b = 10;
     System.out.println("b : " + b++);
     //후행증감 : 지금은 바로 안씀 다음부터 증가
     System.out.println(b);

    b++;//11(+1)
    ++b;//13
    --b;//(-1)12
    b--;//12(-1)
    --b;//10
    b++;//10(+1)
    --b;//10
    b++;//11
    System.out.println(++b);

    }// main
}
