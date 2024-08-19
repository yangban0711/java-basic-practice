package OOP.poly.car;

public class Main {
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Ford f1 = new Ford();
        Ford f2 = new Ford();
        Ford f3 = new Ford();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Sonata[] sonatas = {s1,s2,s3};   //sonata 객체가 선언된 배열에는 sonata 만 들어갈 수 있다
        for (Sonata s : sonatas) {
            s.run();
        }

        //반면, 부모의 타입인 Car로 배열을 선언하면 자식 객체들의 주소값이 전부 들어올 수 있다.
        Car[] cars = {s1, s2, s3, f1, f2, f3, t1, t2, t3};
        for (Car c : cars) {
            c.run();
        }
        System.out.println("----------------------------------------------------------");

        Driver kim = new Driver();
        kim.drive(s1);

    }
}
