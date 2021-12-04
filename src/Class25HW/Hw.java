package Class25HW;

import java.util.ArrayList;

public class Hw {
    public static void main(String[] args) {

        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

        ArrayList<String> listofNames=new ArrayList<>();
        listofNames.add("Sebastian");
        listofNames.add(("jose"));
        listofNames.add("jimmy");
        listofNames.add("asghar");
        listofNames.add("mario");

        System.out.println(listofNames.isEmpty());
        System.out.println(listofNames.contains("Sebastian"));
        System.out.println(listofNames.size());
        System.out.println(listofNames);


    }
}
