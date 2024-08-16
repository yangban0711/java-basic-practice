package OOP.encap.car;

public class Main {
    public static void main(String[] args) {

        Car c = new Car("Volvo");

        c.engineStart();
        c.setMode('D');
        c.setSpeed(100);
        c.setSpeed(0);
        c.setMode('P');
        c.engineStop();
    }
}
