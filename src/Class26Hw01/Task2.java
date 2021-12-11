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
        // remove e from the words
        for(int i=0;i<Words.size();i++){
            String str=Words.get(i);
            if(str.toLowerCase().endsWith("e")){
                Words.set(i,str.substring(0,str.length()-1));
            }
        }
        System.out.println(Words);


        // this operation might change the size of the original list its not good idea to use
        // loops without iterator.
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

