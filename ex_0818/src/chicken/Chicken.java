package chicken;

public class Chicken {//설계도
    
    int price = 8000;
    String name = "후라이드";

    public void order(){
        System.out.println(price + "원 짜리" + name + "치킨을 주문");
    }
}

