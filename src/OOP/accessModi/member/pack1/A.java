package OOP.accessModi.member.pack1;

public class A {

    //필드
    public int f1;
    int f2;
    private int f3;

    //매서드
    public void m1() {}
    void m2() {}
    private void m3() {}

    //생성자
    public A(int a) {}
    A(double b) {}
    private A(boolean c) {}

    void test() {
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;

        m1();
        m2();
        m3();

        new A(10);
        new A(3.14);
        new A(false);
    }

}
