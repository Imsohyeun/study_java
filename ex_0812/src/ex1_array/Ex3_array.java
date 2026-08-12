package ex1_array;

public class Ex3_array {
    public static void main(String[] args) {
        
        char[] ch = new char[4];

        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';

        for(int i = 0; i < ch.length; i++){

            System.out.println(ch[i]);

        }//for

        System.out.println("-------------------");

        char[] ch2 ={ 'J','A','V','A' };//꼭 한줄로 써야 선언이 된다

        for(int i = 0; i < ch2.length; i++){
            System.out.println(ch2[i]);

        }//for


    }//main
}
