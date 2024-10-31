public class FreeDecorator extends BaseDecorator {
    Component freeItem;

    public FreeDecorator(Combo combo, Component freeItem){
        super(combo);
        this.freeItem=freeItem;
        this.freeItem.setPrice(0);
        combo.add(freeItem);
    }

    @Override
    public Integer getPrice() {
        return super.getPrice();
    }

    @Override
    public void show(){
        super.show();
        System.out.println(freeItem.getName()+" (Free!!!)");
    }

}
