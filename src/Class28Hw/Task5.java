package Class28Hw;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        Collection<String> objects=new LinkedList<>();
        objects.add("car keys");
        objects.add("spoon");
        objects.add("fork");
        objects.add("phone");

        for(String obj:objects){
            System.out.println(obj);
        }
    }
}
