package OOP.accessModi.member.pack1;

public class B {

    void test() {

        A a1 = new A(50);   //public
        A a2 = new A(3.14); //default
        //A a3 = new A(true);  //private

        a1.f1 =20;
        a1.f2 =30;
        //a1.f3 =40;  //private

        a1.m1();
        a1.m2();
        //a1.m3();


    }
}
