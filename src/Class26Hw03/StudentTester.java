package Class26Hw03;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {
    public static void main(String[] args) {

        Set<Students>students=new HashSet<>();
        students.add(new Students("Sorbon","123cow"));
        students.add(new Students("Sebastian","mememaster"));

        for(Students students1:students){
            students1.printname();
        }
    }
}
