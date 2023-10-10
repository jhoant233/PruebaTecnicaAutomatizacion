package questions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.PageSlider.*;


public class VerifySliderValue implements Question {

    public static VerifySliderValue is() {
        return new VerifySliderValue();
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade sliderValueElement = SLIDER_VALUE.resolveFor(actor);
        return sliderValueElement.getAttribute("value");
    }
}
