import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;
    private static void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\101\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(WebDriverConfig.configChrome());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    public static WebDriver getDriver(){
        if (driver == null){
            setDriver();
        }
        return driver;
    }
    public static void closeDriver(){
        //driver.close();
        //driver.quit();
    }
}
