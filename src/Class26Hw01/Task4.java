package Class26Hw01;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {

        //Create an arrayList of even numbers from 1 to 50.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=1; i<=50; i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        for(int j=0; j<numbers.size(); j++){
            if(numbers.get(j)%5==0){
                numbers.remove(j);
            }
        }
        System.out.println(numbers);
        System.out.println("Other way of doing it ");

        ArrayList<Integer>evennumbers=new ArrayList<>();
        for(int i=2; i<=50; i=i+2){
            evennumbers.add(i);
        }
        System.out.println(evennumbers);

        Iterator<Integer>iterator=evennumbers.iterator();
        while (iterator.hasNext()){
            int number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evennumbers);

    }
}
