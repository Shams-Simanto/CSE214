import WebServer.Django;
import WebServer.NodeJS;
import WebServer.Ruby;
import WebServer.WebServer;

public class WebServerFactory {
    public static WebServer getWebServer(String choice) {
        if (choice == null)
            return null;
        if (choice.equalsIgnoreCase("Django"))
            return new Django();
        if (choice.equalsIgnoreCase("NodeJS"))
            return new NodeJS();
        if (choice.equalsIgnoreCase("Ruby"))
            return new Ruby();
        return null;
    }
}
