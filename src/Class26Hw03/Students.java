package Class26Hw03;

public class Students {
    //Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order.
        // Each student object should have name and studentID.
        // Display name of each student.

        String name;
        String studentId;

        public Students(String name,String studentId){
            this.name=name;
            this.studentId=studentId;
        }
        void printname(){
            System.out.println(name);
        }
    }

