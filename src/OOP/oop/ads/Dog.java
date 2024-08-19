package OOP.oop.ads;

public class Dog extends Pet{


    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("개는 와구와구");
    }

    @Override
    public void takeNap() {
        System.out.println("마당에서 쿨쿨");
    }

    public void walk() {
        System.out.println("헥헥헥...");
    }
}
