package OOP.oop.this_;

public class Player {

    String nickName;
    int level;
    int hp;

    Player() {
        System.out.println("Player 생성자 호출");
        this.level = 1;
        this.hp = 50;
    }
    Player(String ingameName){
        this();  //                                         <- Player 1에 이미 있는 this.level과 this.hp를 Player 2의 값으로 가져옴
        System.out.println("Player 생성자 2 호출"); //           Player 2 생성자에서 초기화를 할 수고를 덜어줌
        this.nickName = ingameName;
        //level = 1;
        //hp = 50;
    }
    Player(String ingameName, int hp){
        this(ingameName); //                                  <- 마찬가지로 Player 2에서 받고 있는 매게변수 this.ingameName을 Player 3의 값으로 가져옴
        System.out.println("Player 생성자 3 호출");
        this.hp = hp;

    }
}
