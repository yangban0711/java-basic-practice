package OOP.oop.inter;

public class Main {
    public static void main(String[] args) {


    //  Animal a = new Animal(); //인터페이스는 객체 생성 불가능

        Animal duck = new Duck();
        Violent bullDog = new BullDog();
    //  Huntable bullDog = new BullDog(); (X)   //관련이 있는 클래스/인터페이스 끼리만 선언 가능함

        Violent shark = new Tiger();
        BadAnimal bear = new Bear();

    /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
    */

    //  bear.feed("꿀"); (X)                 // 현재 Bear는 BadAnimal로 선언되어 있는데 feed는 Animal 인터페이스에 포함되어 있으므로 범위를 벗어났다.
        ((Bear) bear).feed("꿀");   // 이를 해결하기 위해 BadAnimal과 Animal을 포함한 Livings를 모두 받고 있는 Bear 형태로 강제 형변환해야 함.

        //구현한 클래스들끼리 쉽고 간편하게 형변환 가능함
        Animal[] animals = {duck, (Animal) bullDog, (Animal) bear, new Tiger()};
    }
}
