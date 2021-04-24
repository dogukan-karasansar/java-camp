public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;

    //constructor
    public Product() {
        System.out.println("Product Çalıştı");
    }

    public Product(int id, String name, double unitPrice, String detail) {
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
}
