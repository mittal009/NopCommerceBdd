import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends Utils
{ String email = "Ali234alia"+timeStamp()+"@yahoo.com";
    private By _registerbutton = By.name("register-button");
    private By _registerLink = By.linkText("Register");
    private By _firstName  = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateofbirthday = By.name("DateOfBirthDay");
    private By _dateofbirthmonth = By.name("DateOfBirthMonth");
    private By _dateofbirthyear = By.name("DateOfBirthYear");
    private By _email = By.id("Email");
    private By _companyname = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmpassword = By.id("ConfirmPassword");
    private By _register_button = By.id("register-button");

    public void enterRegistrationDetails()
    {
        waitForClickable((_registerbutton), 10);
        clickOnElement(_registerLink);
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on register page");
        // type the first name
        typeText((_firstName),"Alia");
        //type last name
        typeText((_lastName),"Ali");
        //select date of the birth
        selectByText((_dateofbirthday), "8");
        //to select the month of the birth
        selectByText((_dateofbirthmonth), "May");
        //select year of birth
        selectByText((_dateofbirthyear), "1990");
//       driver.findElement(By.id("Email")).sendKeys("Ali234alia"+timeStamp()+"@yahoo.com");
        typeText((_email), "Ali234alia"+timeStamp()+"@yahoo.com");
//        typeText(By.id("Email"), email);
        //driver.findElement(By.id("Company")).sendKeys("AA Ltd");
        typeText((_companyname),("AA Ltd"));
        //driver.findElement(By.id("Password")).sendKeys("Aali2012@A");
        typeText((_password),("Aali2012@A"));
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Aali2012@A");
        typeText((_confirmpassword),("Aali2012@A"));
        //driver.findElement(By.linkText("register-button")).click();
        clickOnElement(_register_button);

    }
}
