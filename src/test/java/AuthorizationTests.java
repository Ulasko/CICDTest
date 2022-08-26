import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuthorizationTests extends BaseTest {

    @Test (groups = {"regress"}, description = " Новости дня - Газета.Ru ")
    public void Authorization() {
        new LogOnPage().goToLogOnPage()
                .ClickGoBtn()
                .CheckTitle();

    }

}
