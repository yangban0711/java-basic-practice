package OOP.Fielf;

public class Fieldlocal {

    //필드는 값을 초기화하지 않아도
    //객체 생성 시, 각 타입의 기본값으로 자동 초기화됨
    int aaa;

    // ccc : 매게변수(parameter) -메서드 호출시 반드시 필요한 인자를 받는 변수 (지역변수)
    void foo(int ccc) {

        //지역변수, 메서드 내에서 생성된 변수
        //해당 지역에서만 유효한 변수
        int bbb = 20;

        System.out.println("aaa = " + aaa);  //객체 생성 시, 각 타입의 기본값으로 자동 초기화됨
        System.out.println("bbb = " + bbb);  //지역변수는 초기화하지 않으면 사용이 불가능함
        System.out.println("ccc = " + ccc);
    }
}
