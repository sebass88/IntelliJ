package Class22;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }

    void eat(){
        System.out.println(name+ " eating");
    }

    void performDailyTask(){

        System.out.println(" Eat Sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("Working all day in office and reading emails at night");
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("Attending the classes at day reading at night");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("Giving homework a day  party at night ");
    }
    void designClasses(){
        System.out.println("Creates repl and design new classes");
    }
}
