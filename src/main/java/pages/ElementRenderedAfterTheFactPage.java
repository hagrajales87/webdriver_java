package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementRenderedAfterTheFactPage {

    WebDriver driver;

    private By startButtonElement = By.cssSelector("#start>button");
    private By visibleTextElement = By.cssSelector(".example #finish ");

    public ElementRenderedAfterTheFactPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnStartButton(){

        driver.findElement(startButtonElement).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(visibleTextElement));
    }

    public String getLoadedText(){
        return driver.findElement(visibleTextElement).getText();
    }

}
