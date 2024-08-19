package OOP.poly.car;

public class CarShop {

    public void carPrice(Car c) {
        if (c instanceof Sonata) {               //instanceof의 리턴 값은 boolean이다.
            System.out.println("소나타의 가격");
        }
        else if (c instanceof Ford) {
            System.out.println("포드의 가격");
        }
        else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격");
        }
    }

    /* 주의 : "타입의 종류"를 묻는게 아니라 "타입을 가질 수 있는가?" 를 묻는 것이다.
        EX?

        Mammal
          |
        People
          |
        Student

        Student s
        (s instanceof Mammal) == true

     */
}
