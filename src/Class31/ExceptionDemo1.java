package Class31;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        String name=null;
        System.out.println("line 1");
        try {
            int number1=10;
            int number2=0;
            System.out.println(number1/number2);
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("sending an email to alexey boss ");
        }catch (ArithmeticException e){
            System.out.println("we can't divide by zero");
        }
        System.out.println("Line 2");

    }
}
