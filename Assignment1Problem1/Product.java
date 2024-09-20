import  java.util.LinkedList;

public class Product {
    public LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }
    public LinkedList<String> show() {
        return parts;
    }
}
