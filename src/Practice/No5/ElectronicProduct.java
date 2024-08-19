package Practice.No5;

public class ElectronicProduct {
    String productName;
    double price;
    String manufacturer;

    public ElectronicProduct(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.printf("%s, 가격: %.0f원, 재조사: %s/n"
                                , this.productName, this.price, this.manufacturer);
    }

}
