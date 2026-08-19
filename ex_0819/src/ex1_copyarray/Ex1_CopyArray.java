package ex1_copyarray;

public class Ex1_CopyArray {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;
        arr2[0] = 100;
        /*
         * s h
         * arr1 [1][2][3]
         * arr2 (얕은 복사 : 주소를 넘기는 형태)
         */
        System.out.println("arr1 : " + arr1[0]);
        System.out.println("arr2 : " + arr2[0]);

        /*
         * s h
         * arr1 100[1][2][3] (원본까지 값이 바뀔수 있다)
         * arr2
         */

        // 깊은복사
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = new int[arr3.length];

        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];

            /*
             * s h
             * arr3 [1][2][3]
             * arr4 [][][]
             */
        }
        arr3[0] = 100;

        System.out.println("arr3 : " + arr3[0]);
        System.out.println("arr4 : " + arr4[0]);

    }// main
}
