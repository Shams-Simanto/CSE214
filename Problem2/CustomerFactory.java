public class CustomerFactory {
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
}
