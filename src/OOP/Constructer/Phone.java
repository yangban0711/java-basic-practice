package OOP.Constructer;

public class Phone {

    String model;
    String color;
    int price;

    //생성자
    Phone(){
        System.out.println();
    }

    //생성자 중복선언 (단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야
    //중복을 인정함
    Phone(String pModel) {     //Phone 생성자에 매게변수 추가 호출시 해당 Phone 생성자 호출
                               //추가 매게변수를 호출 안할시 위에 존재하는 기본 Phone 생성자를 호출함

    }

    Phone(String pModel, String color){ //이미 존재하는 생성자들과 타입/갯수로 구분만 되면 추가로 중복선언 가능

    }

}

/*
     # 생성자 (Constructor)

     1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
      클래스 내부에 반드시 하나 이상 존재해야 합니다.

     2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로
      매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
      (default constructor)를 하나 만들어 줍니다.

     3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
      작성하여 선언하고, 리턴 타입이 존재하지 않습니다.

     4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
      기술할 수 있습니다.
*/