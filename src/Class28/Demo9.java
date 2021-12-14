package Class28;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",4.3);
        grocery.put("tomato",4.3);

        System.out.println(grocery);

        Iterator<Map.Entry<String,Double>>iterator=grocery.entrySet().iterator(); //both keys and values

        while(iterator.hasNext()){
            Map.Entry<String,Double>entry=iterator.next();
        }
        System.out.println(grocery);

    }
}
