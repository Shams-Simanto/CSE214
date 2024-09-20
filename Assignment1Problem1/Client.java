import java.util.Scanner;

import InternetConnection.InternetConnection;
import Package.Package;
import WebServer.WebServer;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        SystemBuilder systemBuilder = new SystemBuilder();

        System.out.println("Choose Package type: Basic, Standard, Advanced, Premium");
        String package1 = scanner.nextLine();
        Package packageType = PackageFactory.getPackage(package1);

        System.out
                .println("...........................................................................................");
        System.out.println("Choose Internet Connection type: WiFi, Ethernet, GSM");
        String internetConnection = scanner.nextLine();
        InternetConnection internetConnectionType = InternetConnectionFactory.getInternetConnection(internetConnection);

        System.out
                .println("...........................................................................................");
        System.out.println("Choose Framework type: Django, NodeJS, Ruby");
        String webServer = scanner.nextLine();
        WebServer webServerType = WebServerFactory.getWebServer(webServer);
        System.out.println("...........................................................................................");

        director.construct(systemBuilder, packageType, webServerType, internetConnectionType);
        System.out
                .println("...........................................................................................");
        systemBuilder.show();
        scanner.close();

    }
}