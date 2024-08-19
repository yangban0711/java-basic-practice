package OOP.poly.car;

public class Driver {

    public void drive(Sonata s) {
        System.out.println("운행 시작");
        s.run();
    }

    public void drive(Ford f){                   //다른 타입을 받는 중복선언 가능
        System.out.println("운행 시작");
        f.run();
    }

    //하지만 일일이 선언해야하므로 비효율적임

    //----------------------------------------------------------------------------------------------//

    //부모 타입을 받는 것으로 선언하면 자신 객체 타입을 모두 받을 수 있어 효율적임
    public void drive(Car c) {
        System.out.println("운행 시작");
        c.run();
    }

    public void buyCar(String name) {
        if (name.equals("소나타")) {
            System.out.println("소나타 구입");
        }
        else if (name.equals(("포드"))) {
            System.out.println("포드 구입");
        }
        else{
            System.out.println("nothing");
        }
    }
}
