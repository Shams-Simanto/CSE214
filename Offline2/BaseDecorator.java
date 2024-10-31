public class BaseDecorator extends Combo{

    Component wrappee;

    public BaseDecorator(Combo combo){
        super(combo.getName());
        wrappee=combo;
    }

    public String getName(){
        return wrappee.getName();
    }

    public Integer getPrice(){
        return wrappee.getPrice();
    }

    public void show(){
        wrappee.show();
    }
}
