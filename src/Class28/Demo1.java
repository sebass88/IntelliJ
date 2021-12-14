package Class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        int [] numbers={10,20,30,50,100};
        for(int number:numbers){
            if(number==100){
                System.out.println("found");
                // things are stored based on the indexes
                // hard to search have to go through all the elements in worst case.
            }
        }

        ArrayList<Integer>integerArrayList=new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(50);
        integerArrayList.add(70);
        integerArrayList.add(90);
        System.out.println(integerArrayList.contains(70));
        // contains method is doing the same going through all the elements to search

        Map<Integer,String>studentsInfo=new HashMap<>();
        studentsInfo.put(12345,"Alex");
        studentsInfo.put(4455,"Jimmy");
        System.out.println(studentsInfo.get(4455));
        // Not going through all the elements loops only if we have duplicate data


    }
}
