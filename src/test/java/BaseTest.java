import org.testng.annotations.AfterTest;

public class BaseTest {

//    @BeforeTest(alwaysRun=true)
//    public void OpenLink() {
//        BasePage.goToLogOnPage();
//    }

    @AfterTest(alwaysRun=true)
    public void kill(){
        DriverManager.closeDriver();
    }
}
