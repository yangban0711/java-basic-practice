package OOP.Fielf;

public class Main {
    public static void main(String[] args) {

        Fieldlocal fl = new Fieldlocal();

        fl.foo(100); //지역변수 bbb, ccc는 메소드 블록 (즉, fl.foo)이 끝나면 소멸한다.

        fl.aaa = 50;
        System.out.println(fl.aaa); //반면 aaa는 객체 맴버이기 때문에 계속 호출할 수 있음.
    }
}
