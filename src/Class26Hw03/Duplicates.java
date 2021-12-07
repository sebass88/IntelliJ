package Class26Hw03;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {

            //How can you remove all duplicates from ArrayList?

            List<String> aList=new ArrayList<>();
            aList.add("John");
            aList.add("Jane");
            aList.add("James");
            aList.add("Jasmine");
            aList.add("Jane");
            aList.add("James");

        HashSet<String>hashSet=new HashSet<>(aList);
        System.out.println(hashSet);

        LinkedHashSet<String>name=new LinkedHashSet<>(aList);
        System.out.println(name);

        TreeSet<String>names=new TreeSet<>(aList);
        System.out.println(names);
        }
    }

