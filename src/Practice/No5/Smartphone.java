package Practice.No5;

public class Smartphone extends ElectronicProduct{

    int storageCapacity;

    public Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
