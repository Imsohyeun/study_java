package ex2_set_get;

public class Person2 {

    private String name;
    private int age;

    public void setInfO(String name, int age) {
        //this : 현재 클래스 자신
        this.name = name; // this -현재 내 class자신 ex)private String name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
