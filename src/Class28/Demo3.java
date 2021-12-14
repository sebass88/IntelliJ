package Class28;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>students=new LinkedHashMap<>();
        //students.put(10,"Alex");
       // students.put(10,"Ahmet");// Keys should be unique if we insert the data with same
        //key it will replace the old data

        students.put(20,"Denis");
        students.put(10,"Alex");// replaces if data is already present otherwise
        students.put(100,"Henok");
        students.replace(10,"Alexey");//only replaces if key is already present
        System.out.println(students);
    }
}
