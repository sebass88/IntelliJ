package Class28;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",4.3);
        grocery.put("tomato",4.3);

        System.out.println(grocery);
        Iterator<String>iterator=grocery.keySet().iterator();// map==>set==>Iterator
        while(iterator.hasNext()){
            String key= iterator.next();
            if(key.contains("e")){
                iterator.remove();
            }
        }
        System.out.println(grocery);


    }
}

