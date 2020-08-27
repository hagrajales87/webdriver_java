package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ModalPage {

    private By clickHereLink = By.id("restart-ad");
    private By modalText = By.cssSelector("#modal div.modal-body");
    private By closeButton = By.cssSelector("div.modal-footer p");

    WebDriver driver;

    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickToShowModal(){
        driver.findElement(clickHereLink).click();
    }

    public void getText(){

        do{

        }while(!driver.findElement(modalText).isDisplayed());
        System.out.println("LOOK AT ME!!!!!!!!!!!!!!!!!!!!!!" + driver.findElement(modalText).getText());
    }

    public void closeModal(){
        do{

        }while(!driver.findElement(modalText).isDisplayed());
        driver.findElement(closeButton).click();
    }




}
