package InterFace;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour
    // : openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

    void OpenBrowser();
    void CloseBrowser();
    void MaximizeWindow();
    void FindElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void OpenBrowser() {
        System.out.println("Opens in Chrome");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Closes in Chrome");
    }

    @Override
    public void MaximizeWindow() {
        System.out.println("Maximize window in chrome");
    }

    @Override
    public void FindElement() {
        System.out.println("finds element in Chrome");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void OpenBrowser() {
        System.out.println("opens in firefox");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Closes in firefox");
    }

    @Override
    public void MaximizeWindow() {
        System.out.println("maximizes window in firefox ");
    }

    @Override
    public void FindElement() {
        System.out.println("finds element in firefox");
    }
}
