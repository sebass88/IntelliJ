package Class26Hw01;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> Drinks=new ArrayList<>();
        Drinks.add("Soda");
        Drinks.add("Beer");
        Drinks.add("Orange juice");
        Drinks.add("Red Bull");
        Drinks.add("Wine");
        Drinks.add("Tea");

        for(int i=0; i<Drinks.size(); i++){
            if(Drinks.get(i).contains("a")||Drinks.get(i).contains("e")){
                Drinks.remove(Drinks.get(i));
                Drinks.add(i,"water");
            }
        }
        System.out.println(Drinks);
    }
}
