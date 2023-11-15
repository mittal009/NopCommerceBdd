import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class RegisterResultPage extends Utils
{
    String expectedRegisterSuccessMessage = "Your registration completed";

    public void verifyUserRegisterSuccessfully() {
        String actualRegistrationMessage = getTextFromElement(By.className("result"));
        Assert.assertEquals(actualRegistrationMessage, expectedRegisterSuccessMessage, "not correct message");

    }

    public void verifyUserSendMessageSuccessfully() {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "Your message has been sent.", "Your message has been sent.");
//        //verify the message sent
    }

}