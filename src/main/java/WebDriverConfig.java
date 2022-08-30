import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverConfig {
    public static ChromeOptions configChrome() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\101\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        return options;
    }

}
