import InternetConnection.Ethernet;
import InternetConnection.GSM;
import InternetConnection.InternetConnection;
import InternetConnection.WiFi;

public class InternetConnectionFactory {
    public static InternetConnection getInternetConnection(String choice){
        if(choice==null) return null;
        if(choice.equalsIgnoreCase("WiFi")) return new WiFi();
        if(choice.equalsIgnoreCase("GSM")) return new GSM();
        if(choice.equalsIgnoreCase("Ethernet")) return new Ethernet();
        return null;
    }
}
