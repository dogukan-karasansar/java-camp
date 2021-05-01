public class CustomerManager {
    public void add(Logger logger) {
        System.out.println("Müşteri Eklendi");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log();
    }
}
