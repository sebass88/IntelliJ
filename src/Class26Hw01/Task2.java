package Class26Hw01;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> Words=new ArrayList<>();
        Words.add("Apple");
        Words.add("Banana");
        Words.add("Create");
        Words.add("educate");

        Iterator<String> iterator=Words.iterator();

        while (iterator.hasNext()){
            String word=iterator.next();
            if(word.contains("e")){
                iterator.remove();
            }
        }
        System.out.println(Words);
    }
}

