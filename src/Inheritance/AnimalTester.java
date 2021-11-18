package Inheritance;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.name="lucky";
        dog.bark();
        dog.sleep();


        Cat cat=new Cat();
        cat.name="texy";
        cat.meow();
        System.out.println(dog.name);
    }
}
