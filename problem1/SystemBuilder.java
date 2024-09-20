import Controller.ControllerUnit;
import Identification.Identification;
import Identification.NFCCard;
import Identification.RFIDCard;
import InternetConnection.InternetConnection;
import Package.Package;
import Storage.SDCard;
import Storage.Storage;
import WebServer.WebServer;

public class SystemBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildDisplayUnit(Package package1) {
        product.add("Microcontroller:  " + package1.displayUnit().microcontroller.microcontroller()
                + " has been added to the system.");
        product.add("Display Unit:  " + package1.displayUnit().display.display() + " has been added to the system.");
    }

    @Override
    public void buildWebServer(WebServer webServer) {
        product.add("Web Server:  " + webServer.webServer() + " has been added to the system.");
    }

    @Override
    public void buildInternetConnection(InternetConnection internetConnection) {
        product.add(
                "Internet Connection:  " + internetConnection.internetConnection() + " has been added to the system.");
    }

    @Override
    public void buildStorage(Package package1) {
        Storage storage = null;
        if (package1.displayUnit().microcontroller.microcontroller().equalsIgnoreCase("Raspberry Pi"))
            product.add(
                    "Storage:  " + " Storage is provided along with Raspberry Pi.");
        else {
            storage = new SDCard();
            product.add("Storage:  " + storage.storage() + " has been added to the system.");
        }
    }

    @Override
    public void buildIdentification(Package package1) {
        Identification identification = null;
        if (package1.displayUnit().microcontroller.microcontroller().equalsIgnoreCase("Raspberry Pi"))
            identification = new NFCCard();
        else
            identification = new RFIDCard();
        product.add("Ticketing/Identification:  " + identification.identification() + " has been added to the system.");
    }

    @Override
    public void buildController(Package package1) {
        ControllerUnit controllerUnit = null;
        if (package1.displayUnit().microcontroller.microcontroller().equalsIgnoreCase("Raspberry Pi"))
            product.add(
                    "Controller:  " + " The Touch screen of Raspberry Pi works as controller.");
        else {
            controllerUnit = new ControllerUnit();
            product.add("Controller:  " + controllerUnit.controllerUnit() + " has been added to the system.");
        }
    }

    public void show() {
        for (String part : product.parts) {

            System.out.println(part);
            System.out.println(
                    "...........................................................................................");
            System.out.println("");
        }
    }
}
