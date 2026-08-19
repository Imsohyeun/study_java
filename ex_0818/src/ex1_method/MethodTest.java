package ex1_method;

public class MethodTest {

    public void test1(){
        System.out.println("test1 메서드 호출");
    }

    public int test2( int n ){  //test2호출하고싶으면 강제로 int n
        //n++;
        n += 100;
        System.out.println("결과 : " + n);
//나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.

        return 10; //return 100; -> 오류임//밑에 호출하는게 아예 불가능 

    }
    
}
