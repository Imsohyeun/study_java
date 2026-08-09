package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {
        
        /* 
        과수원이 있다.
        배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
        각각 5, 7, 5개.

        1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        2.시간당 전체 과일의 평균 생산 갯수
        단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
        */

        int pear = 5; //배
        int apple = 7;//사과
        int orange = 5;//오렌지
        int total = pear + apple + orange;
        //float avg = (float)total / 24;
        float avg = total / 24f;

        System.out.println("하루생산량 : " + total);
        System.out.println("시간당 평균 : " + avg);

    // 아래는 위의 문제를 응용한 연습문제입니다. 정답 없이 문제 설명만 작성하세요.

    /*
    [응용 연습문제]

    우리 동네 과수원에서는 하루에 배, 사과, 오렌지, 그리고 바나나를 생산하고 있다.
    각 과일의 하루 생산량은 각각 8개, 12개, 7개, 10개이다.

    1. 하루에 생산되는 과일의 총 갯수를 변수에 저장하고 출력하시오.
    2. 30분(0.5시간)마다 생산되는 전체 과일의 평균 갯수를 구하여 출력하시오.
    3. 하루 총 생산량의 절반 이상을 차지하는 과일이 무엇인지(과일 이름) 구해서 출력하시오.

    (단, 변수의 자료형은 적절하게 선택한다.)
    */


    }//main
}












