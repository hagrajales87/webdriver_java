package pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class DeleteCookie {

    private WebDriver driver;

    public DeleteCookie(WebDriver driver){
        this.driver = driver;
    }

    public Cookie deleteACookie(String name, String value){
       /**
        *  Cookie cookie = new Cookie.Builder("tau","123").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
        */
       Cookie cookie = new Cookie.Builder(name,value)
               .domain("the-internet.herokuapp.com").build();
       driver.manage().deleteCookie(cookie);
       return cookie;

    }

}
