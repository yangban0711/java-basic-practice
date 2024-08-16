package OOP.oop.this_;

public class Main {

    public static void main(String[] args) {
        Player pl = new Player();

        System.out.println("--------------------------------------------");

        Player p2 = new Player(("FP22"));
        System.out.println(p2.nickName);
        System.out.println(p2.hp);

        Player p3 = new Player("FP33", 200);
        System.out.println(p3.nickName);
        System.out.println(p3.hp);
    }

}
