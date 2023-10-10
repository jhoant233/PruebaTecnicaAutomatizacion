package tasks;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.PageHome.*;
import static userinterface.PageSlider.*;

public class Slider implements Task {

    public static Performable carousel() {
        return instrumented(Slider.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(WIDGETS_SECTION),
                Click.on(WIDGETS_SECTION),
                Scroll.to(SLIDER),
                Click.on(SLIDER),
                Wait.seconds(5),
                Click.on(SLIDER_COMTAINER),
                Wait.seconds(2)
        );
        for (int i = 0; i < 47; i++) {
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_LEFT).into(SLIDER_COMTAINER)
            );
        }
    }
}
