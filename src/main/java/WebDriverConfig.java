import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverConfig {
    public static ChromeOptions configChrome() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.addArguments("--ignore-certificate-errors");
        return options;
    }

}
