package Class28Hw;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person>personTreeMap=new TreeMap<>();
        Person person=new Person("jonny","bravo",45,10000);
        Person person1=new Person("gail","kim",40,120000);

        personTreeMap.put(1,person);
        personTreeMap.put(2,person1);

        Collection<Person>value=personTreeMap.values();
        for(Person values:value){
            values.printDetails();
        }




    }
}
