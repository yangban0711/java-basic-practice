package OOP.oop.inter;

public class Bear extends Livings implements BadAnimal{

    //String name;
    //int age;           <- Livings 구현된 것을 상속받았으므로 선언필요 x


    @Override
    public void feed(String foodName) {

    }

    @Override
    public Boolean sleep() {
        return null;
    }

    @Override
    public void hunt(Animal animal) {

    }

    @Override
    public void angry() {

    }

    @Override
    public void fight() {

    }
}
