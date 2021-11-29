package InterFace;

public interface Person {
    //private void eat();
    //protected void eat();
    void eat();
    void sleep();
}
interface Employee extends Person{
    void work();
}

interface SyntaxEmployees extends Employee,Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployees{
    @Override
    public void eat() {
        System.out.println("Syntax employees eating");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax Employee sleeping");
    }

    @Override
    public void work() {
        System.out.println("Creating new Repl's");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employee Teach IT");
    }
}