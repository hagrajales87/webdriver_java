package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iFramePage {

    WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public iFramePage(WebDriver driver){
        this.driver = driver;
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return  text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }

}
