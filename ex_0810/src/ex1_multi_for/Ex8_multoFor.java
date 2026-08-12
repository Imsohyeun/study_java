package ex1_multi_for;

public class Ex8_multoFor {
    public static void main(String[] args) {
        
        /*
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
           .....
        10 1 2 3 4 5 6 7 8 9   
        */

        //for(int i = 0; i < 10; i++){

            //for(int j = 0; j < 10; j++){
            
                    //System.out.print((i+ j)% 10 + 1 +  " ");

                

           // }//inner

            //System.out.println();

        //}//outer

        for (int i = 1; i <= 10; i++){

            for(int j = 0; j <=9; j++){
                           // <10;
                
                int res = i + j;

                if(res > 10)
                res -= 10;
                System.out.print(res + " ");
                 

            }//inner

            System.out.println();
        }//outer


    }//main
}
