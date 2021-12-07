package Class26;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet=new LinkedHashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);
    }
}