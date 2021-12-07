package Class24Projects;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new Firefox(), new Safari()};
        for (RemoteWebDriver remoteWebDriver : remoteWebDrivers) {
            remoteWebDriver.open();
            remoteWebDriver.close();
            System.out.println(remoteWebDriver.getTitle());
            remoteWebDriver.getScreenshot();
            remoteWebDriver.navigate();
        }

    }
}
