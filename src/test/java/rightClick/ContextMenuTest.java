package rightClick;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest  extends BaseTests {

    @Test
    public void rightClick(){
        var contextPage = homePage.clickContextMenu();
        contextPage.rightClickOnBox();
        String text = contextPage.getPopUpText();
        assertEquals(contextPage.getPopUpText(),"You selected a context menu","Incorrect Message");
        System.out.println(text);
        contextPage.closePopUp();

    }

}
