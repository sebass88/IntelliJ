package Class28Hw;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person>map=new TreeMap<>();
        map.put(0001,new Person("joe","biden",75,50000.0));
        map.put(0002,new Person("Bill","Gates",70,10000000.0));
        map.put(0003,new Person("Elon","Musk",55,6000000.0));

        Collection<Person> details=map.values();
        for (Person detail:details){
            String info=detail.printDetails();
            System.out.println(info);
        }
    }
}
