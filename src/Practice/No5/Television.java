package Practice.No5;

public class Television extends ElectronicProduct {

    int screensize;

    public Television(String productName, double price, String manufacturer, int screensize) {
        super(productName, price, manufacturer);
        this.screensize = screensize;
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
