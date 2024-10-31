public class DiscountedDecorator extends BaseDecorator{
    Integer discount;

    public DiscountedDecorator(Combo combo,Integer discount){
        super(combo);
        this.discount=discount;
    }

    @Override
    public Integer getPrice(){
        return super.getPrice()-(super.getPrice()*discount/100);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Discount - " + discount + "%");
        System.out.println("Discounted Total - " + getPrice() + "tk");
        System.out.println();
    }
}
