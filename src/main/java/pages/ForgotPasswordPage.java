package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmailField(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public RetrievePasswordPage clickButton(){
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePasswordPage(driver);
    }

}
