package Class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("git");
        subjects.add("Selenium");
        subjects.add("Testng");

        Iterator<String> iterator=subjects.iterator();


        while(iterator.hasNext()){
            String element=iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}
