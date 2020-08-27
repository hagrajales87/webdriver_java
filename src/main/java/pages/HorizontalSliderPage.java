package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.cssSelector(".sliderContainer input");
    private By range = By.cssSelector(".sliderContainer #range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectSliderElement(){
        driver.findElement(slider).click();
    }

    public String moveSliderRight(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        return driver.findElement(range).getText();
    }


}
