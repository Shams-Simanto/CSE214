public abstract class BaseDecorator implements Component{
    
    Component wrappee;

    public BaseDecorator(Component component){
        //super(combo.getName());
        wrappee=component;
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
