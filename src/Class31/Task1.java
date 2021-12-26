package Class31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("Please enter a number");
            int number=scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("only numbers");
        }

    }
}
