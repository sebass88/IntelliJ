package Class26Hw01;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

    public static void main(String[] args) {

        //Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> Cars=new ArrayList<>();
        Cars.add("Lexus");
        Cars.add("Tesla");
        Cars.add("BMW");
    Cars.add(1,"Honda");// will be addes at index number 1
        System.out.println(Cars);
        System.out.println("-----");
        System.out.println("FOR LOOP");

        for(int i=0; i<Cars.size(); i++){
            System.out.println(Cars.get(i));
        }
        System.out.println("------");
        System.out.println("Enhanced for loop");
        for(String car:Cars){
            System.out.println(car);
        }
        System.out.println("----------------");
        System.out.println("Using Iterator");

        Iterator<String>iterator= Cars.iterator();
        //hasNext()= returns true if there are still any elements in Iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
