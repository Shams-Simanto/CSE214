public class Food implements Component {
    Integer price;
    String name;

    public Food(String name, Integer price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer i){
        this.price=i;
    }

    public void show() {
        if (this.getPrice() == 0)
            System.out.println(this.name + " (Free)");
        else
            System.out.println(this.name + " - " + this.price + " tk");

        System.out.println();
        //System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
