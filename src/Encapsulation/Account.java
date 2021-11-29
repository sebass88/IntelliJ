package Encapsulation;

public class Account {
    private String name;
    private String Username;
    private String Password;
    private double balance=1000;

    Account(){

    }

    public Account(String name, String username, String password, double balance) {
        setName(name);
        setPassword(password);
        setUsername(username);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<20){
            this.name = name;
        }

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
