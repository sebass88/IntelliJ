package InterFace;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new FirefoxDriver(),new ChromeDriver()};
        for(WebDriver webDriver:webDrivers){
            webDriver.OpenBrowser();
            webDriver.MaximizeWindow();
            webDriver.FindElement();
            webDriver.CloseBrowser();

        }

    }
}
