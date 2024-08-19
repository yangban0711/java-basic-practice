package OOP.poly.player;

public class Hunter extends Player{
    String pet;

    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;
    }

    public void snipe(Player target) {
        System.out.printf("%s이 %s에게 저격 시전\n", this.nickName, target.nickName);

        int damage; String job;

        if (target instanceof Warrior){
            damage = 10; job = "전사";
        }
        else if (target instanceof Mage){
            damage = 20; job = "마법사";
        }
        else{
            damage = 15; job = "헌터";
        }

        target.hp -= damage;

        System.out.printf("%s은 %d의 피해를 입었다", target.nickName, damage);
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Pet name: " + pet);
    }


}
