package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;

    private By linkExampleOne = By.linkText("Example 1: Element on page that is hidden");
    private By LinkExampleTwo = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public ElementPageHiddenPage clickOnExampleOne(){

        driver.findElement(linkExampleOne).click();
        return new ElementPageHiddenPage(driver);
    }

    public ElementRenderedAfterTheFactPage clickOnExampleTwo(){
        driver.findElement(LinkExampleTwo).click();
        return new ElementRenderedAfterTheFactPage(driver);
    }

}
