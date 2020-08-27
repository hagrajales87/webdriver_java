package iFrames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class iFrameTest extends BaseTests {

    @Test
    public void iFrameTest(){
        var framePages = homePage.clickFramesPage();
        var iFramePage = framePages.clickOniFrame();
        iFramePage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        iFramePage.setTextArea(text1);
        iFramePage.decreaseIndention();
        iFramePage.setTextArea(text2);
        assertEquals(iFramePage.getTextFromEditor(), text1+text2, "Text from editor is incorrect!!!");
    }
    @Test
    public void frameNestedTest(){
        var framesPages = homePage.clickFramesPage();
        var nestedFrames = framesPages.clickOnNestedFrame();
        String textOnLeft =nestedFrames.getTextOntLeftFrame();
        assertEquals(textOnLeft.equalsIgnoreCase("LEFT"),true,"The text is not correct!!!");
        String textOnBottom = nestedFrames.getBottomFrameText();
        assertEquals(textOnBottom,"BOTTOM","Bottom Message is incorrect");
    }
}
