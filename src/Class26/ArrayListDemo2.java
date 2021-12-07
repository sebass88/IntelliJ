package Class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        //System.out.println(subjects.get(3));

        for(int i=0; i<subjects.size(); i++){
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);
    }
}
