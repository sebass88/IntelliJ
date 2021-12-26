package Class31;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        try {
            Account.Withdraw(-10);
        }catch (InsufficientBalanceException e){
            e.printStackTrace();
        }

    }
}
