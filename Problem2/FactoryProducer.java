public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Customer")) {
            return new CustomerFactory();
        } else if (choice.equalsIgnoreCase("Operations")) {
            return new OperationsFactory();
        }
        return null;
    }
}