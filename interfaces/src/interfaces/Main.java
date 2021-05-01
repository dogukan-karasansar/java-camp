package interfaces;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = {new EmailLogger(), new DatabaseLogger(), new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add(new Customer(1, "Doğukan", "Karasansar"));

    }
}
