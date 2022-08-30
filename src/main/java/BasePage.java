import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static String startPage = "https://www.gazeta.ru/";
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    public LogOnPage goToLogOnPage(){
        DriverManager.getDriver().get(startPage);
        return new LogOnPage();
    }


}

