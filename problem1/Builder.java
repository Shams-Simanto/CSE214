import InternetConnection.InternetConnection;
import Package.Package;
import WebServer.WebServer;

public interface Builder {
    void buildDisplayUnit(Package package1);
    void buildWebServer(WebServer webServer);
    void buildInternetConnection(InternetConnection internetConnection);
    void buildStorage(Package package1);
    void buildIdentification(Package package1);
    void buildController(Package package1);
}
