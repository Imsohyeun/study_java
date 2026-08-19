package ex4_work;//이해안감

public class CheckWord {
  
    public String check(String str){

        String rev = "";



         for( int i = str.length()-1; i >= 0; i-- ){//int의 i가 -1
           rev += str.charAt(i);
        

        }//for

        return rev;
    }
}
