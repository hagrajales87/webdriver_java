package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTest extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickOnExampleOne();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindow().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
