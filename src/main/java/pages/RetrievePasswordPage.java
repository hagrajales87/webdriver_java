package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {

    WebDriver driver;

    private By recoverPasswordMessage = By.id("content");

    public RetrievePasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getMessage()
    {
     return driver.findElement(recoverPasswordMessage).getText();
    }


}
