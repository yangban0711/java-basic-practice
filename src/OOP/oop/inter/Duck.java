package OOP.oop.inter;


//인터페이스는 implements(구현)으로 클래스와 연결함
public class Duck extends Livings implements Huntable {


    //String name;
    //int age;         <- Livings 구현된 것을 상속받았으므로 선언필요 x

    @Override
    public void feed(String foodName) {

    }

    @Override
    public Boolean sleep() {
        return false;
    }

    //일반 메소드도 선언 가능
    public void swim() {
        System.out.println("헤엄헤엄");
    }

    @Override
    public void hunt(Animal animal) {

    }
}
