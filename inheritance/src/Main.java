public class Main {

    public static void main(String[] args) {
        IndividualCustomer dogukan = new IndividualCustomer();
        dogukan.customerNumber = "12345";

        CorporeteCutomer hepsiBurada = new CorporeteCutomer();
        hepsiBurada.customerNumber = "123456";

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(dogukan);
        customerManager.add(hepsiBurada);

        Customer[] customers = {dogukan, hepsiBurada};
        customerManager.multipleAdd(customers);
    }
}
