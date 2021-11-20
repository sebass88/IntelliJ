package methodoverriding;

public class Parent {

    String name="Sedat";
    void printName(){
        System.out.println("name is "+name);
    }
    void getmarried(){
        System.out.println("Ahmet will get married by my choice");
    }
}
class Child extends Parent{
    String name="Ahmet";
    void printName(){
        String name="Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


    @Override
    void getmarried(){
        System.out.println("But I like someone else");
    }
    void letsdosomethingcrazy(){
        super.getmarried();
        getmarried();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.letsdosomethingcrazy();
    }

}
