package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {
        
      //삼항(조건)연산자 (표기 : ?)★
      //하나의 조건식을 통해 발생하는 결과를 원하는 타입으로
      //반환할 수 있도록 하는 연산자
      int a = 10;
      int b = 15;
      
      int res = ++a >= b ? 100 : 200;
      //int res = ++a >= b ? true : 200; 이렇겐 못쓴다 같은 정수를 써야함
      //100은 참일때 쓴다
      //200은 거짓일때 쓴다
      System.out.println("res : " + res);

      int n1 = 10;
      int n2 = 20;
      float res2 = (n1 + n1) == n2 ? 3.14f : 5.19f;
      //n1 = n1 + n1 = 20
      //20 == 20 ? 3.14 : 5.19
      System.out.println("res2 : " + res2);

      a = 10;
      b = 12;
     char res3 = ++a >= b || (a - 8) + 7 <= b&& 13 - b >=0 && (a+=b) - (a%b) > 10 ? '0' : 'x';
      // 11 >= 12 (f) ||(or) 25 <= 12 (f) (and) 1>=0 (f) (and) 22-2 > 10(t) ? o : x (내가 틀린것)
      // false || (11-8) + 7 = 10 <= 12 (ture) &&(and) 1 >= (ture) && (11+12=a)=23 - 12/23(a)=11 (ture) ? 'o' : 'x' = o
      System.out.println("res3 : " + res3);
      







    }//main
}//class end
