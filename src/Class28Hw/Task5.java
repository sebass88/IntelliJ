package Class28Hw;


import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        Set<String> set=new LinkedHashSet<>();
        set.add("chair");
        set.add("spoon");
        set.add("tree");

        StringBuilder values=new StringBuilder();
        for(String str:set){
            values.append(str);
        }

        System.out.println(values);

    }
}
