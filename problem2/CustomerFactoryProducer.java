import CustomerFactory.AbstractCustomerFactory;
import CustomerFactory.VIPCustomerFactory;
import CustomerFactory.PremiumCustomerFactory;
import CustomerFactory.RegularCustomerFactory;

public class CustomerFactoryProducer {
    public static AbstractCustomerFactory getCustomerFactory(String choice){
        if(choice == null) return null;
        if(choice.equalsIgnoreCase("VIP")){
            return new VIPCustomerFactory();
        }
        if(choice.equalsIgnoreCase("PREMIUM")){
            return new PremiumCustomerFactory();
        }
        if(choice.equalsIgnoreCase("REGULAR")){
            return new RegularCustomerFactory();
        }
        return null;
    }
}
