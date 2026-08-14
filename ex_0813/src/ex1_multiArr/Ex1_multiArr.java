package ex1_multiArr;

public class Ex1_multiArr {
    public static void main(String[] args) {
        
        int[][] test = new int[2][3]; //[2]큰방 Y열, [3]작은방 X열//가장 작은방에만 값을 넣을 수 있다//Y열X열 생각하면 쉬움
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;

        for( int i = 0; i < test.length; i++ ){

            for( int j = 0; j < test[i].length; j++ ){

                System.out.print(test[i][j] + " ");


            }//inner

            System.out.println(  );

        }//outer

    }//main
}
