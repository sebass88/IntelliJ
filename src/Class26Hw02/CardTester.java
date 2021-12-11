package Class26Hw02;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card>linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("creditcard"));
        linkedList.add(new DebitCard("debit card"));
        linkedList.add(new PrePaidCard("prepaid card"));

        for( Card cd:linkedList){
            cd.issuecard();
            cd.calculateInterest();
        }
    }
}
