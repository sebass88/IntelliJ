package Class28Hw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        //Create a Map that will store Employee name and salary.
        // Write a logic to retrieve an employee who gets the highest salary.
        // Output should be in the below format

        Map<String,Integer>employee=new HashMap<>();
        employee.put("Sebastian G",95000);
        employee.put("Jimmy C",96000);
        employee.put("Henok Y",97000);
        employee.put("Olga K",98000);
        employee.put("Elon Musk",100000000);

         Integer high=(Collections.max(employee.values()));
        Set<Map.Entry<String,Integer>>entrySet=employee.entrySet();
        for(Map.Entry<String,Integer>entry:entrySet){
            if(entry.getValue()==high){
                System.out.println(entry.getKey()+"=$"+entry.getValue());
            }
        }
    }
}
