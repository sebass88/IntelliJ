package Class31Hw;

public class AgeEligibilityException extends Exception{


        //Create a method to check age eligibility that will throw a runtime exception.
        // Method should throw an exception age is less than 16.
    AgeEligibilityException(String message){
        super(message);
    }
}
class Task1{
    public static void Age(int age) throws AgeEligibilityException {
        if(age<16){
            throw new AgeEligibilityException("Age cannot be less than 16");
        }
    }
}
class Method1{
    public static void main(String[] args) {
        try {
            Task1.Age(15);
        } catch (AgeEligibilityException e) {
            e.printStackTrace();
        }
    }
}
