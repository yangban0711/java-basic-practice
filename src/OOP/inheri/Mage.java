package OOP.inheri;

public class Mage extends Player{

    int mana;

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + mana);
    }

    public Mage(String ingameName) {
        super(ingameName);
        this.mana = 100;


    }



}
