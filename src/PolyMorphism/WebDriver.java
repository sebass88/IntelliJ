package PolyMorphism;

public class WebDriver {

    void openWebsite(){
        System.out.println("Opening a Website");
    }
    void signup(){
        System.out.println("Signup on the website");
    }
    void Login(){
        System.out.println("Login to website");
    }
    void enterUserPassword(){
        System.out.println("Enter the user password");
    }
    void clicksubmit(){
        System.out.println("Clicking on submit button");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class GoogleChrome extends WebDriver{

    void openWebsite(){
        System.out.println("Opening a Website in Google Chrome");
    }
    void signup(){
        System.out.println("Signup on the website in Google Chrome");
    }
    void Login(){
        System.out.println("Login to website in Google Chrome");
    }
    void enterUserPassword(){
        System.out.println("Enter the user password in Google Chrome");
    }
    void clicksubmit(){
        System.out.println("Clicking on submit button in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Google Chrome");
    }

    void specialMethod(){
        System.out.println("only present in Chrome");
    }

}
class FireFox extends WebDriver{

    void openWebsite(){
        System.out.println("Opening a Website in FireFox");
    }
    void signup(){
        System.out.println("Signup on the website in FireFox");
    }
    void Login(){
        System.out.println("Login to website in FireFox");
    }
    void enterUserPassword(){
        System.out.println("Enter the user password in FireFox");
    }
    void clicksubmit(){
        System.out.println("Clicking on submit button in FireFox");
    }
    void closeBrowser(){
        System.out.println("closing the browser in FireFox");
    }
}
class Safari extends WebDriver{

    void openWebsite(){
        System.out.println("Opening a Website in Safari");
    }
    void signup(){
        System.out.println("Signup on the website in Safari");
    }
    void Login(){
        System.out.println("Login to website in Safari");
    }
    void enterUserPassword(){
        System.out.println("Enter the user password in Safari");
    }
    void clicksubmit(){
        System.out.println("Clicking on submit button in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Safari");
    }
}