package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
        //다중if문( else if )
        //여러개의 조건 비교가 필요한 경우 사용하는 if문

        //if( 조건식1 ){
        // 조건식1이 참일 때 실행되는 영역
        //}else if( 조건식2 ){
        //  조건식2기 참일 때 실행되는 영역
        //}

        int num = 50;
        String str = "";

        if( num >= 90 ){
            str = "A";

        }else if( num >= 80){
            str ="B";
        }else if(num >=70){
            str = "C";

        }else if(num >=60){
            str = "D";
        }else{
            //위의 조건식들이 모두 거짓일때 반드시 호출되는 영역
            //}else if( num <= 59){ 
            str = "F";
        }
         //참인걸 만나면 아래쪽은 없는거나 마찬가지이다 
        System.out.println(str);
        
        //나이가 20이상 -> 성인요금
        //14이상 20미만 -> 청소년요금
        //8이상 14미만 -> 어린이 요금
        //8미만 -> 유아요금

        int age = 20;
        String stg = "";

        if(age >=20 ){
            stg ="성인요금";

        }else if(age >= 14 ){
            stg = "청소년요금";

        }else if(age >= 8 ){
            stg = "어린이요금";

        }else{
            stg = "유아요금";
        }

        System.out.println(stg);


    }//main
    
}//class
