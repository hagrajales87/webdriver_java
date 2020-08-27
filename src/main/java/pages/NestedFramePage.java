package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramePage {

    WebDriver driver;

    private String topFrame = "frame-top";
    private String leftFrame ="frame-left";
    private String bottomFrame = "frame-bottom";
    private By textOnFrame = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextOntLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = driver.findElement(textOnFrame).getText();
        switchToMainArea(); //exit left to top
        switchToMainArea(); //exit top to main
        return text;

    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = driver.findElement(textOnFrame).getText();
        switchToMainArea(); //exit top to main
        return text;
    }


    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
