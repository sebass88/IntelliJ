package Class22;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person("Asghar");
        person.eat();

       // Person person1=new Student("Mikyl");
        Person []persons={new Student("Farhad"),new Employee("Naiya"),new Teacher("Asel")};

        for (Person person2:persons){
            person2.performDailyTask();


            if (person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }

        }

    }
}
