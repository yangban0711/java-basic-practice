package OOP.encap.good;

public class Main {

    public static void main(String[] args) {

        Mybirth my = new Mybirth();
       // my.year = 31241; (x)
        my.setYear(1991);
        my.setMonth(1112);
        my.setDay(11111);

        my.birthinfo();
    }
}


/*
     - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
      캡슐화 라고 합니다. (encapsulation)
      데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
*/