package ex1_multi_for;

public class Ex3_multiFor {
    public static void main(String[] args) {
        //A B C D
        //E F G H
        //I J K L
        char ch = 'A';

        for(int i = 1; i <=3; i++){

            for(int j = 1; j <= 4; j++){
                System.out.print(ch++ + " ");//후행증감을 해야 A부터 시작한다

            }//inner

            System.out.println();
        }//outer


    }//main
}
