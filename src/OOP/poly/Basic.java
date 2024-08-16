package OOP.poly;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


/*
          Object
            |
            A
         /    \
        B     C
        |     |
        D     E
 */



public class Basic {

    void test() {
        
        A a = new A();
        B b = new B();
        
        A v1 = new B(); //클래스 타입 B -> A 타입으로 자동 형변환 (Promotion)
        A v2 = new C(); //부모(상위) 자식(하위) 객체이므로 올려서 선언 가능
        A v3 = new D(); //몇 단계 건너서 상속 받은 자식객체 또한 promotion 가능
        A v4 = new E(); 
        
        B v5 = new D();
        
        //다형성의 주목적은 "타입의 규격화"이다.
        //마치 다양한 회사의 케이블이 존재하지만 결국 HDMI 케이블의 표준이 규격화 되어 어느 곳의 케이블을 선택해도 상관 없는 것
    }
}
