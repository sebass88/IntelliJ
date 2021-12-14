package ReviewClass10;

public class FacebookAccount {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        if(username.length()>8){
            System.out.println("Username can't be more than 8 characters");
        }else {
            this.username=username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
