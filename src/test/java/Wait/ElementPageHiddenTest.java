package Wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ElementPageHiddenTest extends BaseTests {

    @Test
    public void elementPageTest(){
        var dynamicPage = homePage.clickDynamicLoading();
        var elementPage = dynamicPage.clickOnExampleOne();
        elementPage.clickOnStartButton();
        String text = elementPage.getLoadedText();
        assertEquals(text,"Hello World!","Loaded text incorrect");
    }

    @Test
    public void loadedPageElementsTest(){
        var dynamicPage = homePage.clickDynamicLoading();
        var elementPage = dynamicPage.clickOnExampleTwo();
        elementPage.clickOnStartButton();
        String text = elementPage.getLoadedText();
        assertEquals(text,"Hello World!","Get message is incorrect");
    }
}
