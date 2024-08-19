package OOP.poly.player;

import OOP.poly.player.Player;


public class Mage extends Player {

    int mana;

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + mana);
    }

    Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }
/*
         1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.
         2. Mage 클래스에 blizzard라는 메서드를 완성하세요.
         3. 메서드 호출부에 들어갈 매개값으로 알맞은 매개변수를 선언하세요.
          광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
          그런데 매개변수는 하나입니다.
          ex) m1.blizzard(???); (배열 쓰라는 소리에요.)
         4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
          사용하여 출력해 보세요.
         5. 피해량(데미지)은 10 ~ 15사이의 난수를 발생시켜서
          타겟들에게 각각 적용해 주세요.
         6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
          출력해 주세요.
*/

    public void blizzard(Player... targets) {
        System.out.printf("%s의 눈보라 시전", this.nickName);
        System.out.println();
        this.mana -= 30;
        System.out.printf("남은 마나 : %d", this.mana);
        System.out.println();
        System.out.println("----------------------------------");
        for (Player p : targets){
            int damage = (int) ((Math.random()*6) + 10);
            p.hp -= damage;
            System.out.printf("%s에게 %d의 데미지 (남은 체력 %d)",
                    p.nickName, damage, p.hp);
            System.out.println();
        }
    }


}

