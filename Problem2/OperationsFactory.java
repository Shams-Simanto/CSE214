public class OperationsFactory extends AbstractFactory{
    @Override
    public Operations getOperationsType(String operation){
        if(operation==null) return null;
        if(operation.equalsIgnoreCase("Loan")) return new Loan();
        if(operation.equalsIgnoreCase("Accounts")) return new Accounts();
        return null;
    }
    @Override
    public Customer getCustomer(String CustomerType){
        return null;
    }
}
