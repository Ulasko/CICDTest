import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class LogOnPage extends BasePage {

    @FindBy(css = ".b_nav-item")
    private WebElement GoBtn;
    @FindBy(css = "#inputLogin")
    private WebElement TextBoxPhone;


    public LogOnPage() {
        PageFactory.initElements(driver, this);
    }

    public LogOnPage ClickGoBtn(){
        GoBtn.click();
        return this;
    }
    public LogOnPage CheckTitle(){
        Assert.assertEquals("Новости дня - Газета.Ru", driver.getTitle());
        return this;
    }


//    public LogOnPage checkErrorMessage(String text) {
//        LoginBtn.click();
//        Assert.assertTrue(TextAuthorizationError.isDisplayed());
//        Assert.assertEquals(text, TextAuthorizationError.getText());
//        return this;
//    }
//
//    public MyPortfolioPage clickLoginBtn() {
//        LoginBtn.click();
//        return new MyPortfolioPage();
//    }
}
