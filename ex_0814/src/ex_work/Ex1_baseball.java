package ex_work;

import java.util.Random; //랜덤숫자 만들기위해나온 패키지
import java.util.Scanner; // Scanner 치면 나와야하는 패키지

public class Ex1_baseball {//제목
    public static void main(String[] args) {//main치면 나오는 코드
        
        Scanner sc = new Scanner(System.in);// 키보드 입력받기 위해 쓴것(고정되어있는 식)

        int[] com = new int[3];//com에 정수 3을 생성해라 라는 뜻 
        int[] user = new int [3];//user에 정수 3을 생성해라 라는 뜻
        outer : for( int i = 0; i < com.length; i++ ){//com의 for문을 만들기 위한 식, outer는 바깥쪽,
                                                    //int i는 0이고, i는 com보다 작다, i는 1증가
            com[i] = new Random().nextInt(9) + 1;//랜덤을 이용해 1~9사이 숫자를 만듬, 숫자를 만들고 com[i]에 대입한다

            //중복값 비교
            for( int j = 0; j < i; j++ ){//바깥for문에서 만든 숫자와 안쪽for문에서 만든 숫자가 같은지 다른지 확인한다
                                        //j는 0이고, j는 i보다작다, j는 1 증가

                if( com[i] == com[j] ){// 두개의 숫자가 같으면 중복이돼서 continue outer;로 간다
                                       //위에 outer가 써져있어 이 for문 밖으로 나간다
                    continue outer;

                }

            }//inner

            i++; //i가 증가한다

        }//outer
        System.out.println("정답 : " + com[0] + com[1] + com[2] );//밖으로 나온 숫자를 출력하기위한 출력문
                                                                //com[0] com[1] com[2]를 출력한다

        int cnt = 0; //새로운 변수 0으로 시작한다

        while (true) {// 정답이 맞춰질때까지 무한반복하는 while문~!
            
            System.out.print("입력(예:123) : ");//3자리 숫자를 입력하라는 출력문

            int number = sc.nextInt();// nextInt() : 정수, next() : 문장 
                                      //정수를 number라는 변수에 대입한다
                                      //예를들어 123을넣으면 123이 들어간다

            user[0] = number / 100; //100의자리 숫자를 구하는것
            user[1] = number / 10 % 10;// 십의자리 숫자를 구하는것
            user[2] = number % 10;// 일의 자리 숫자를 구하는것

            int strike = 0; //strike변수가 0부터 시작
            int ball = 0;//ball변수가 0부터 시작

            for( int i = 0; i < user.length; i++ ){//저기위에있는 com숫자와 user숫자를 비교하기위한 for문
                                                    //이중 for문을 이용해 또 숫자비교 들어감

                for( int j = 0; j < user.length; j++ ){//user숫자들을 비교하기위한 안쪽 for문

                    if( i == j ){// i랑 j가 같은지 보는것
                        if( com[i] == user[j])// com[i]랑 user[j]가 같으면 strike~!!
                            strike++;//strike 갯수가 1증가한다

                    }else{//i랑 j가 다르면 다른걸 비교한다
                        if(com[i] == user[j])//이번엔 두개의 갯수가 같으면 ball~!!
                            ball++;//ball 갯수가 1 증가한다
                        
                    }

                }//inner

            }//for

            //정답처리
            if( strike == 3 ){//strike가 3인걸 확인해본다 3인게 맞으면 strike로 결과가 나올거다
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);//정답!! 이라는 문장이 출력된다
                System.out.println(cnt + "회 클리어");//몇회만에 클리어 했는지 출력이 된다

                break;//정답이 나왔으니 break사용해서 while문을 빠져나온다
            }else{//만약 정답이 안나왔다면 strike나 ball이있는지 확인을 해본다~
                if( strike > 0 || ball > 0 ){// ||는 또는이란 뜻이니 둘중 하나라도 된다면 실행이 된다
                    System.out.printf("%d strike, %d Ball\n", strike, ball);// strike랑 ball의 갯수를 출력하는거다, %d에는 정수값이 들어간다, \n은 줄바꿈을 하는것이다

                }else{//strike도없고 ball도없다면 다 없어서 OUT을 출력한다
                    System.out.println("OUT");
                }
            }

            System.out.println("---------------------------");//결과를 깔끔하게 보기위한 구분선이다

        }//while


    }//main
}
