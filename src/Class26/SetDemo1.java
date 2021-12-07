package Class26;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {


        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);
    }
}
