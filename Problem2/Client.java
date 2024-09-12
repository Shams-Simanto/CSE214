public class Client{
    public static void main(String[] args) {
        AbstractFactory customerFactory = FactoryProducer.getFactory("Customer");
        Customer customer = customerFactory.getCustomer("Regular");
        
        AbstractFactory operationsFactory = FactoryProducer.getFactory("Operations");
        Operations operation = operationsFactory.getOperationsType("Loan");

    }
}