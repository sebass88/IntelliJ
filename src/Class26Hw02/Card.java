package Class26Hw02;

public abstract class Card {
    //Create a Card class that will have implemented  and unimplemented methods
    // and a constructor that will initializes credit card type.
    // Create 3 subclasses of a Card card.
    // Create 3 objects of different card and store them into LinkedList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.

    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }
    public void issuecard(){
        System.out.println(cardType+" Issued");
    }
    public abstract void calculateInterest();
}
class CreditCard extends Card{

    public CreditCard(String cardType) {
        super(cardType);
    }

    @Override
    public void calculateInterest() {
        System.out.println("interest is 10%");

    }
}
class DebitCard extends Card{

    public DebitCard(String cardType) {
        super(cardType);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest is 0%");
    }
}
class PrePaidCard extends Card{

    public PrePaidCard(String cardType) {
        super(cardType);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest is 5%");

    }
}
