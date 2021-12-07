package Class26;

import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();
            subjects.add("SDLC");
            subjects.add("Manual Testing");
            subjects.add("Java");
            subjects.add("Git");
            subjects.add("Selenium");
            subjects.add("Testng");
            System.out.println(subjects);
            subjects.set(2,"Python");
            System.out.println(subjects);

        }
    }

