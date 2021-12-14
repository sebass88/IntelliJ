package Class26Hw03;

import java.util.Iterator;
import java.util.TreeSet;

public class countries {
    public static void main(String[] args) {

        //Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.

        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("Peru");
        treeSet.add("United States");
        treeSet.add("Mexico");
        treeSet.add("Russia");
        treeSet.add("Spain");
        System.out.println(treeSet);

        System.out.println("--------------------");

        for(String tree:treeSet){
            System.out.println(tree);

        }
        System.out.println("--------------------");

        Iterator<String>iterator=treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
