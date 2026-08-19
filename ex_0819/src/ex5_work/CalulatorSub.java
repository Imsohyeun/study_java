package ex5_work;

public class CalulatorSub {

  public int getResult( int su1, int su2, String op){

    switch (op) {
        case "+":
           // System.out.println(su1+su2);
             return su1 + su2;
    
            case"-" :
            //System.out.println(su1-su2);
            return su1 - su2;
    
            case "*" :
                //System.out.println(su1 * su2);
               return su1 * su2;
    
            case "/" :
                  //  System.out.println(su1/su2);
             return su1 / su2;

             default:
                System.out.println("연산 기호가 올바르지 않습니다");

             return -1;
                    }//switch

  }//getresult

}
