public abstract class AbstractFactory {
    abstract Customer getCustomer(String CustomerType);
    abstract Operations getOperationsType(String operation);
}
