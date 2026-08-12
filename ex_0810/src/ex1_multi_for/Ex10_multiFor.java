package ex1_multi_for;

public class Ex10_multiFor {
    public static void main(String[] args) {

        /*
         * 1 3 5 7 9
         * 3 5 7 9 1
         * 5 7 9 1 3
         * 7 9 1 3 5
         * 9 1 3 5 7
         */

        for (int i = 1; i <= 10; i += 2) {

            for (int j = 0; j <= 9; j += 2) {
                // <10;

                int res = i + j;

                if (res > 10)
                    res -= 10;
                System.out.print(res + " ");

            } // inner

            System.out.println();
        } // outer
        
        System.out.println("------------------------");

        for( int i = 0; i < 5; i++ ){

            for( int j = 0; j < 5; j++ ){

                int num = 1 + (i * 2) + (j * 2);

                if( num > 10 )
                    num -= 10;

                System.out.print(num + " ");

            }//inner

            System.out.println();

        }//outer

    }// main

}
