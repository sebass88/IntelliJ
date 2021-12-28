package ReviewClass12;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapsDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();// Thread Safe
        linkedHashMap.put("Hasim",22);
        linkedHashMap.put("Demir",25);
        linkedHashMap.put("Alona",17);
        linkedHashMap.put("Marina",16);
        System.out.println(linkedHashMap);

      
    }
}
