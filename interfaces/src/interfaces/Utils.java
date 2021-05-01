package interfaces;

public class Utils {
    public static void runLoggers(Logger[] loggers, Customer customer) {
        for(Logger loger: loggers) {
            loger.log(customer.getFirstName());
        }
    }
}
