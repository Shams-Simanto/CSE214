package Problem1;

import java.util.LinkedList;

public class Product {
    public LinkedList<String> parts;
    public Product(){
        parts= new LinkedList<String>();
    }
    public void add(String part){
        parts.addLast(part);
    }   
    public void show(){
        for(var part: parts){
            System.out.println(part);
        }
    }
}
