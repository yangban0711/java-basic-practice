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

        //상속 관계가 없다면 다형성 적용이 불가능합니다.
        //즉, 다형성은 무조건 상속 관계 하에서만 발생합니다.

        B v5 = new D();
        
        //다형성의 주목적은 "타입의 규격화"이다.
        //마치 다양한 회사의 케이블이 존재하지만 결국 HDMI 케이블의 표준이 규격화 되어 어느 곳의 케이블을 선택해도 상관 없는 것

        //Object는 자바의 최상위 클래스입니다.
        //모든 객체는 Object의 자식입니다.
        //Object 타입의 변수에는 어떠한 객체도 들어올 수 있습니다.

        Object o1 = new A();
        Object o2 = new B();
        Object o3 = new C();
        Object o4 = new D();

    }

    /*
     * 이 메서드는 비밀번호를 변경해주는 공개된 메서드로서
     * 사용자는 기존에 사용하던 패스워드를 올바르게 전달하고
     * 새롭게 사용할 패스워드를 전달합니다.
     * @param oldPassword - 기존에 사용하던 비밀번호
     * @param newPassword - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true, 실패하면 false
     */
     /*
    - 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을
     의미합니다.
    - 즉, 부모 타입의 변수에 자식 객체의 주소값을 얼마든지 저장할 수
    있다는 것을 의미합니다.
     */


}
