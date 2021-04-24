public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Macbook", 8000, "Macbook air 2020 notebook");

        Product product2 = new Product(2, "Macbook", 8000.0, "Macbook air 2015 notebook");

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Macbook";
        product3.detail = "Macbook air 2012 notebook";
        product3.unitPrice = 8000.0;

        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.name);
        }

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev";

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);

    }
}
