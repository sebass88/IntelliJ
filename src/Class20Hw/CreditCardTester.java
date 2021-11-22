package Class20Hw;

import java.util.concurrent.Callable;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100);
        creditCard.calculateInterest();
        AX ax=new AX(200);
        ax.calculateInterest();
        Visa visa=new Visa(300);
        visa.calculateInterest();

    }
}
