public class CustomerFactory extends AbstractFactory{
    @Override
    public Customer getCustomer(String CustomerType){
        if(CustomerType==null){
            return null;
        }
        if(CustomerType.equalsIgnoreCase("Regular")){
            return new RegularCustomer();
        }
        if(CustomerType.equalsIgnoreCase("Premium")){
            return new PremimumCustomer();
        }
        if(CustomerType.equalsIgnoreCase("VIP")){
            return new VIPCustomer();
        }
        return null;
    }
    @Override
    public Operations getOperationsType(String operation){
        return null;
    }
}
