package Practice.No6;

public class Product {

    String ProductName;
    int price;

    public Product(String ProductName, int price){
        this.ProductName = ProductName;
        this.price = price;
    }

    void sellProduct() {
        Store.addSale(this.price);
    }



}
