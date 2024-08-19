package OOP.oop.inter;

public interface Inter {

    //인터페이스에서 변수를 선언하면 상수(static final)로 인식함

    static final int num = 5;
        //인터페이스는생성자를 가질수 없습니다. (객체화 될 수 없는 대상입니다.)


    //인터페이스에서 메서드를 선언하면 추상 메서드로 지정됨
    void method1();

    public static void staticMethod() {
        System.out.println("가능함");
    }

}
