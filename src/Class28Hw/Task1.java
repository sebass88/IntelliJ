package Class28Hw;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator

        Map<String,String>countries=new TreeMap<>();
        countries.put("Spain","Madrid");
        countries.put("Peru","Lima");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("England","London");
        //System.out.println(countries);
        System.out.println("-------------");

        System.out.println("FOR EACH LOOP");

        Set<Map.Entry<String,String>>entrySet=countries.entrySet();
        for(Map.Entry<String,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("----------ITERATOR-------------------");
        Iterator<Map.Entry<String,String>>iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String>entry= iterator.next();
        }
        System.out.println(countries);
        System.out.println("----ALL VALUES USING FOR EACH LOOP---------");

        for(String value:countries.values()){
            System.out.println(value);
        }
        System.out.println("---ALL VALUES USING ITERATOR-----");

        Iterator<Map.Entry<String,String>>JustValuesPrint=countries.entrySet().iterator();
        while(JustValuesPrint.hasNext()){
            Map.Entry<String ,String>print= JustValuesPrint.next();
        }
        System.out.println(countries.values());



    }
}
