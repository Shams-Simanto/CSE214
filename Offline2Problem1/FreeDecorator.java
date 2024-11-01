public class FreeDecorator extends BaseDecorator {
    Component freeItem;

    public FreeDecorator(Component component, Component freeItem){
        super(component);
        this.freeItem=freeItem;
        //this.freeItem.setPrice(0);
        //combo.add(freeItem);
    }

    @Override
    public Integer getPrice() {
        return wrappee.getPrice();
    }

    @Override
    public void show(){
        //wrappee.show();
        System.out.println(freeItem.getName()+" (Free!!!)");
    }

}
