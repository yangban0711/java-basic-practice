package OOP.oop.ads;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Dog("뽀삐", "푸들", 3);
        Cat cat = new Cat("춘식이", "삼색냥", 2);
        GoldFish fish = new GoldFish("잉어킹", "금붕어", 1);

        Pet[] pets = {dog, cat, fish};

        for (Pet p: pets) {
            p.takeNap();
            p.eat();
            p.walk();
            p.sayHello();

            System.out.println();
        }
    }
}

/*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
          프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
          메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
          구현하기가 편합니다.
         - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
*/