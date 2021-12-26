package ReviewClass11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>();
        LinkedList<String> list1=new LinkedList<>();// If not planning to use polymorphism this is much better to use

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("coke");
        drinks.add(0,"Pepsi");// use this method to add elements at specific index
       // drinks.add(5,"pepsi");// if this index does not exist , we will be getting the IndexOutBounds exception
        drinks.add("Fanta");
        System.out.println(drinks);
        drinks.remove("Fanta");
        System.out.println(drinks);
        drinks.remove(0);
        System.out.println(drinks);
        System.out.println(drinks.get(0));
        drinks.set(0,"Coke");  // replaces the element at this index
        System.out.println(drinks);

    }
}
