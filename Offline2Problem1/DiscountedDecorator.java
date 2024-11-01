public class DiscountedDecorator extends BaseDecorator{
    Integer discount;

    public DiscountedDecorator(Component component,Integer discount){
        super(component);
        this.discount=discount;
    }

    @Override
    public Integer getPrice(){
        return wrappee.getPrice()-(wrappee.getPrice()*discount/100);
    }

    @Override
    public void show(){
        //wrappee.show();
        System.out.println("Discount - " + discount + "%");
        System.out.println("Discounted Total - " + getPrice() + "tk");
        System.out.println();
    }
}
