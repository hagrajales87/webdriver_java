package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    WebDriver driver;

    private By iFrame = By.linkText("iFrame");
    private By NestedFrames = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public iFramePage clickOniFrame(){
        driver.findElement(iFrame).click();
        return new iFramePage(driver);
    }

    public NestedFramePage clickOnNestedFrame(){
        driver.findElement(NestedFrames).click();
        return new NestedFramePage(driver);
    }



}
