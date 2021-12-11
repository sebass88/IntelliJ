package Class27;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {

        // remove e from the words at the end

        ArrayList<String> Words=new ArrayList<>();
        Words.add("Apple");
        Words.add("Banana");
        Words.add("Create");
        Words.add("educate");

        for(int i=0;i<Words.size();i++){
            String str=Words.get(i);
            if(str.toLowerCase().endsWith("e")){
                Words.set(i,str.substring(0,str.length()-1));
            }
        }
        System.out.println(Words);
    }
}
