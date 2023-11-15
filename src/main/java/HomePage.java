import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{
    private By _registerLink = By.linkText("Register");
    public void verifyUserIsOnRegisterPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on register page");
    }
    public void clickOnRegisterButton()
{
    clickOnElement(_registerLink);
}


}
