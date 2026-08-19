package ex3_stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        
      String str = "안녕";
      str = "반갑습니다";
      str += "!";
      // str   안녕
      //        반갑습니다
      //         반갑습니다! -> 수정이안되고 새로계속 생기는것
          
      System.out.println(str);

      StringBuffer sb = new StringBuffer("안녕");
      sb.setLength(0); //sb가가지고 있던 안녕이라는 길이를 세팅할래 = 0이니까 싹다 날림
      sb.append("반가워요");
      sb.append("!!!");
/*
 s        h
sb      안녕 (setLength 0하면 싹 사라짐)
    (append를 하면 추가적으로 이어붙혀진다)
      반가워요 !!!

 */

      System.out.println(sb.toString() ); 

    }//main
}
