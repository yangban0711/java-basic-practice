package OOP.inheri;

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

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

}

/*
    # 부모 클래스, 상위 클래스 (Parent, super class)

    - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
    - 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
     멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/
