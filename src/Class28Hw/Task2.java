package Class28Hw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer,String>BestBuyStore=new LinkedHashMap<>();
        BestBuyStore.put(113345,"Playstation");
        BestBuyStore.put(12785,"Flat screen Tv's");
        BestBuyStore.put(89563,"Ipad's");
        BestBuyStore.put(569877,"Iphone 13");

        Set<Map.Entry<Integer,String>>entrySet=BestBuyStore.entrySet();
        for(Map.Entry<Integer,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
