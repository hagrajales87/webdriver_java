package Slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class SliderTest extends BaseTests {

    private int range;
    @Test
    public void moveSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        //horizontalSliderPage.selectSliderElement();
        do {
            System.out.println(horizontalSliderPage.moveSliderRight());
            range = Integer.parseInt(horizontalSliderPage.moveSliderRight());
        }while(range < 4);


    }
}
