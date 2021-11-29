package Class24Projects;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends TakesScreenshot,WebDriver{
    void navigate();

}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("ChromeDriver opens");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver closes");
    }

    @Override
    public String getTitle() {
        return"Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes a screenshot in chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates in chrome");
    }
}
class Firefox implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Firefox opens");
    }

    @Override
    public void close() {
        System.out.println("Firefox closes");
    }

    @Override
    public String getTitle() {
        return "FireFox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Firefox navigates");
    }
}
class Safari implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Safari opens");
    }

    @Override
    public void close() {
        System.out.println("Safari closes");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Safari navigates");
    }

}