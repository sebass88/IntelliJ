package Class28Hw;

import java.util.Collection;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {

        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers

        Collection<Integer>numbers=new LinkedList<>();
        numbers.add(50);
        numbers.add(100);
        numbers.add(100);
        numbers.add(50);
        numbers.add(150);
        numbers.add(150);
        int sum=0;
        for(Integer num:numbers){
            sum+= num;
        }
        System.out.println(sum);
    }
}
