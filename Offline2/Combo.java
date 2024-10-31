import java.util.ArrayList;
import java.util.List;

public class Combo implements Component {
    String name;
    Integer price=0;

    List<Component> children = new ArrayList<>();

    public Combo(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Combo(String name) {
        this.name = name;
    }

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer i){
        this.price=i;
    }

    public Integer getPrice() {
        return price;
    }

    public void show() {
        StringBuilder s = new StringBuilder(name + " ");
        s.append("( ");

        for (int i = 0; i < children.size(); i++) {
            s.append(children.get(i).getName());

            if (i < children.size() - 1) {
                s.append(" + ");
            }
        }

        s.append(" ) ");
        System.out.println(s + " - " + this.getPrice() + " tk");
        //System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

    }
    
    
}
