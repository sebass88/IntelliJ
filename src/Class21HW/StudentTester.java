package Class21HW;

public class StudentTester {
    public static void main(String[] args) {
       Student[]students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
       for(Student stu:students){
           stu.study();
           stu.Hw();
           stu.tired();
       }
       Student stud=new SyntaxStudent();
       SyntaxStudent syx=(SyntaxStudent)stud;
       syx.makingMemes();

       Student colls=new CollegeStudent();
       CollegeStudent coll=(CollegeStudent) colls;
       coll.partying();

       Student schstu=new SchoolStudent();
       SchoolStudent schs=(SchoolStudent) schstu;
       schs.holidays();

    }
}
