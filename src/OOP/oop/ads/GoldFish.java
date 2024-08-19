package OOP.oop.ads;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("뻐끔뻐끔");
    }

    @Override
    public void takeNap() {
        System.out.println("눈 뜨고 물속에서");
    }
}
