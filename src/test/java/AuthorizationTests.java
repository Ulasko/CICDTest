import org.testng.annotations.Test;

public class AuthorizationTests extends BaseTest {

    @Test (description = " Новости дня - Газета.Ru ")
    public void Authorization() {
        new LogOnPage().goToLogOnPage()
                .ClickGoBtn()
                .CheckTitle();

    }

}
