package interfaces;

public class CustomerManager {
    private Logger[] logers;

    public CustomerManager(Logger[] logers) {
        this.logers = logers;
    }

    public void add(Customer customer) {
        System.out.println("Müşteri eklendi " + customer.getFirstName());
        Utils.runLoggers(logers, customer);
    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi " + customer.getFirstName());
        Utils.runLoggers(logers, customer);
    }
}
