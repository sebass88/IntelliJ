package Class19Hw;

public class UserClass {

   // Write program: userClass  that has a constructor that initializes
    // instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable
    // and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method.
    // Test your code.

    String name;
    int mobilenumber;
    UserClass(String name,int mobilenumber){
        this.name=name;
        this.mobilenumber=mobilenumber;

    }
}

class UserInfo extends UserClass{

    String Useraddress;
    UserInfo(String name,int mobilenumber){
        super(name,mobilenumber);
        this.Useraddress=Useraddress;
    }
    void UserDetails(){
        System.out.println("name is "+name+" mobilenumber is "+mobilenumber+" address is "+Useraddress);
    }


}
