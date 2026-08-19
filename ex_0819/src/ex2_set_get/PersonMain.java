package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setGender("여자");
        System.out.println("성별 : " + p1.getGender());//p1.getGender() = 여자가됨


        p1.setName("홍길동");
        System.out.println("이름 : " + p1.getName());

        p1.setAge(30);
        System.out.println("나이 : " + p1.getAge());

        System.out.println("-------------------------------");

        Person2 p2 = new Person2();
        p2.setInfO("홍길동", 30);

        System.out.println("이름 : " + p2.getName());
        System.out.println("나이 : " + p2.getAge());
       

    
        // p1.gender = "남자";
        // p1.name = "홍길동";
        // p1.age = 20;
        
        // System.out.println("이름 : " + p1.name);
        // System.out.println("나이 : " + p1.age);

        /*
        s          h
        p1       |person
                 gender =남자  => person p1 = new person() 이다
                 name = 홍길동
                 age =20 |
        */



    }//main
    
}
