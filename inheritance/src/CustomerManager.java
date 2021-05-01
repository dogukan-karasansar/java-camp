public class CustomerManager {
    public void add(Customer customer) {
        System.out.println("Kyadedildi "+customer.customerNumber);
    }

    public void multipleAdd(Customer[] customers) {
        for(Customer customer: customers) {
            System.out.println(customer.customerNumber+" Customer Eklendi");
        }
    }
}
