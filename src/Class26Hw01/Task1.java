package Class26Hw01;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        //Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> Cars=new ArrayList<>();
        Cars.add("Honda");
        Cars.add("Tesla");
        Cars.add("Chevy");
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
    }
}
