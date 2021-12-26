package Class31;

import java.io.FileInputStream;

public class ExceptionDemo2 {
    public static void main(String[] args)  {
try {
    Thread.sleep(1000); // checked exception
    FileInputStream fileInputStream = new FileInputStream("dsadsad");
}catch (Exception e){
    System.out.println("something went wrong");
}
        int number=10;
        int number2=0;
        if(number2!=0){
            System.out.println(number/number2);// unchecked exceptions
        }else{
            System.out.println("can't divide by zero");
        }
        String name=null;
        if(name!=null){
            System.out.println(  name.length());
        }else{
            System.out.println("name variable is null");
        }

        // why we have checked and unchecked exceptions
    }
}
