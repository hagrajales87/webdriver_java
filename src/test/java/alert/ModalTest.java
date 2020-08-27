package alert;

import base.BaseTests;
import org.testng.annotations.Test;


public class ModalTest extends BaseTests {

    @Test
    public void getTextTest(){
        var entryAd = homePage.clickEntryAd();
        entryAd.getText();
    }

    @Test void closeModalTest(){
        var entryAd = homePage.clickEntryAd();
        entryAd.closeModal();
    }
}
