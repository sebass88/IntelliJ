package ReviewClass11;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(30);
        arrayList.remove(5); // removes the element at index 5
        arrayList.remove(new Integer(5));  // removing by objects require an object
        System.out.println(arrayList);
        Collections.sort(arrayList); // sort the data numerrcally
        System.out.println(arrayList);
        Collections.reverse(arrayList);// reversing the order
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
