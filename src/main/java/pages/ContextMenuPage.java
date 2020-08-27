package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    WebDriver driver;

    private By boxFigure = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickOnBox(){

        WebElement box = driver.findElement(boxFigure);
        Actions actions = new Actions(driver);
       // actions.moveToElement(box).contextClick().perform();
        actions.contextClick(box).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void closePopUp(){
        driver.switchTo().alert().accept();
    }


}
