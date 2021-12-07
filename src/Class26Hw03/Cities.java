package Class26Hw03;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Cities {
    public static void main(String[] args) {

        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;

        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Alexandria");
        linkedHashSet.add("Springfield");
        linkedHashSet.add("Burke");
        linkedHashSet.add("Fairfax");
        linkedHashSet.add("Reston");
        System.out.println(linkedHashSet);
        System.out.println("-------------");

        Iterator<String>iterator=linkedHashSet.iterator();
        while(iterator.hasNext()){
            String link=iterator.next();
            if(link.startsWith("A")||link.startsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(linkedHashSet);


    }
}
