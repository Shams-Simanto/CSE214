package Problem1;

public class Basic implements IBuilder{
    private Product product =new Product();
    @Override
    public void buildDisplayUnit(){
        product.add("ATMega32 with LCD display has been added to the system");
    }
    @Override
    public void buildTicketing(){
        product.add("RFID cards has been added to the system");
    }
    @Override
    public void buildInternetConnection(String internetConnection){
        product.add(internetConnection+" has been added to the system");
    }
    @Override
    public void buidStorage(){
        product.add("SD card has been added to the system");
    }
    @Override
    public void buildController(){
        product.add("A separate controller has been added to the system");
    }
    @Override
    public void buildWebServer(String webServer){
        product.add(webServer+" has been added to the system");
    }
    @Override
    public Product getPackage(){
        return product;
    }
}
