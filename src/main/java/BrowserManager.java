import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
    public void openBrowser()
    {System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");
}

    public void closeBrowser()
    {
        driver.quit();
    }


}
