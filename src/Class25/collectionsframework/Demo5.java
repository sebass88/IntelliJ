package Class25.collectionsframework;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("Testng");
        subjects.add("Cucumber");
        subjects.add("Sql");
        subjects.add("APIs");
        subjects.add("Docker");
        subjects.add("AWS");
        subjects.add("Mobile Testing");
        subjects.add("Mock Interview");
        subjects.add("Dead");
        System.out.println(subjects.size());
        subjects.remove("Dead");
        System.out.println(subjects.size());
        System.out.println(subjects.indexOf("Sql"));


    }
}
