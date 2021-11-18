package Class18HW;

public class Task2 {
    //Write program to inherit class A that has
            //method printF which is static and call or reuse that method into class B

    public static void main(String[] args) {
        B1.printF();
    }


}

class A1{
    static void printF(){
        System.out.println("printF from A");
    }
}

class B1 extends A1{

}


