package OOP.oop.ads;

import java.sql.SQLOutput;

public class Cat extends Pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("고양이는 챱챱");
    }

    @Override
    public void takeNap() {
        System.out.println("타워 위에서 쿨쿨");
    }
}
