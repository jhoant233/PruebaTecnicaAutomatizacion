package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageSlider extends PageObject {

    public static final Target SLIDER_COMTAINER = Target
            .the("Slider container")
            .located(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));

    public static final Target SLIDER_VALUE = Target
            .the("Slider value")
            .located(By.xpath("//*[@id=\"sliderValue\"]"));
}
