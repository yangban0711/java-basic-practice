package OOP.inheri;

public class Main {
    public static void main(String[] args) {
        Warrior war = new Warrior("뿌뿌뿡");
        //war.nickName = "뿌뿌뿡";
        //war.level = 20;
        //war.hp = 100;
        //war.rage = 50;

        war.showStatus();

        System.out.println("--------------------------------------");

        Mage mag = new Mage("물리법사");
        mag.showStatus();
    }



}
