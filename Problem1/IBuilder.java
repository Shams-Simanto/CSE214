package Problem1;

public interface IBuilder {
    void buildDisplayUnit();
    void buildTicketing();
    void buildInternetConnection(String internetConnection);
    void buidStorage();
    void buildController();
    void buildWebServer(String webServer);
    Product getPackage();
}
