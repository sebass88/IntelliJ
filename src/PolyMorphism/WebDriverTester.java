package PolyMorphism;

public class WebDriverTester {
    public static void main(String[] args) {
      //  WebDriver webDriver=new Safari();
       // webDriver.openWebsite();
       // webDriver.signup();
        //webDriver.Login();
       // webDriver.enterUserPassword();
        //webDriver.clicksubmit();
        //webDriver.closeBrowser();


        WebDriver webDriver=new GoogleChrome();

        GoogleChrome chrome=(GoogleChrome)webDriver;
        chrome.specialMethod();


    }
}
