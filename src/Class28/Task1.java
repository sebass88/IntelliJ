package Class28;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map

        Map<Integer,String>buildings=new HashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Syntax");
        buildings.put(3,"Amazon");
        buildings.put(4,"Wells Fargo");
        buildings.put(5,"Microsoft");
        buildings.put(6,"Sony");
        buildings.put(7,"StarBucks");
        System.out.println(buildings);
        System.out.println(buildings.size());

        System.out.println("----------");
        System.out.println(buildings.replace(4,"Bank of America"));
        System.out.println(buildings);
        System.out.println("----------");
        System.out.println(buildings.remove(7,"StarBucks"));
        System.out.println(buildings);
    }
}
