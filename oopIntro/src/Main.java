public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Macbook", 8000, "Macbook air 2020 notebook", 10);

        Product product2 = new Product(2, "Macbook", 8000.0, "Macbook air 2015 notebook", 10);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Macbook");
        product3.setDetail("Macbook air 2012 notebook");
        product3.setUnitPrice(15000.0);
        product3.setDiscount(10);
        System.out.println(product3.getName());

    }
}
