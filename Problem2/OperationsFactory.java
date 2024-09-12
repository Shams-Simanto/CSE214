public class OperationsFactory {
    public Operations gOperationsType(String operation){
        if(operation==null) return null;
        if(operation.equalsIgnoreCase("Loan")) return new Loan();
        if(operation.equalsIgnoreCase("Accounts")) return new Accounts();
        return null;
    }
}
