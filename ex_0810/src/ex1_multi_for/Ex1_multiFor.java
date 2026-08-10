package ex1_multi_for;

public class Ex1_multiFor {
    
    public static void main(String[] args) {
        
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        for( int i = 1; i <= 3; i++ ){ //2회전 y(세로)

            for( int j = 1; j <= 5; j++ ){ //x(가로) 3회전

                System.out.printf("%d ", j);

            }//inner
            System.out.println();//enter만 치는 식

        }//outer

           System.out.println("-------------------");

           //5 4 3 2 1
           //5 4 3 2 1
           //5 4 3 2 1

           for( int i = 1; i <= 3; i++ ){

               for( int j = 5; j >=1; j-- ){
                
                System.out.print(j + " ");

            }//inner

            System.out.println();

           }//outer

    }//main
}
