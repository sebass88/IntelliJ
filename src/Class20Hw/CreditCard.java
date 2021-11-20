package Class20Hw;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double balance=12000.0;
    double interest=3.99;

    void calculate(){
        System.out.println(balance*interest/100);
    }

}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    void calculate(){
        System.out.println("Ax card interest is "+balance*interest/150);
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculate();
        Visa visa=new Visa();
        visa.calculate();
        AX ax=new AX();
        ax.calculate();

    }

}
