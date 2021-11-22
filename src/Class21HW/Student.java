package Class21HW;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void study(){
        System.out.println("To get good grades you need to study");
    }
    void Hw(){
        System.out.println("Students always have a lot of homework");
    }
    void tired(){
        System.out.println("Students are tired alot from their school");
    }
}
class SyntaxStudent extends Student{
    @Override
    void Hw() {
        System.out.println("We have a lot of Replt's to do");
    }
    void makingMemes(){
        System.out.println("We love making memes in class about each other");
    }
}
class CollegeStudent extends Student{
    @Override
    void Hw() {
        System.out.println("College students always have double the homework");
    }
    void partying(){
        System.out.println("College students love to go out and Party");
    }
}
class SchoolStudent extends Student{
    @Override
    void Hw() {
        System.out.println("The school students don't like doing their homework");
    }
    void holidays(){
        System.out.println("School students get alot of holidays off from school");
    }
}