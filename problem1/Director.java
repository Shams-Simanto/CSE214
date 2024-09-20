import InternetConnection.InternetConnection;
import Package.Package;
import WebServer.WebServer;

public class Director {
    Builder builder;

    public void construct(Builder builder, Package package1, WebServer webServer,
            InternetConnection internetConnection) {
        this.builder = builder;
        this.builder.buildDisplayUnit(package1);
        this.builder.buildWebServer(webServer);
        this.builder.buildInternetConnection(internetConnection);
        this.builder.buildStorage(package1);
        this.builder.buildIdentification(package1);
        this.builder.buildController(package1);
    }
}
