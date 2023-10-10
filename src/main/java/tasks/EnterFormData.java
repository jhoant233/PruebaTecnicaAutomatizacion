package tasks;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.PageHome.*;
import static userinterface.PageSlider.SLIDER_COMTAINER;
import static userinterface.PracticeForm.*;

public class EnterFormData implements Task {
    public static Performable theTest() {
        return instrumented(EnterFormData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FORM_SECTION),
                Click.on(FORM_SECTION),
                Click.on(PRACTICE_FORM),
                Enter.theValue("Johan").into(FIRST_NAME),
                Enter.theValue("Tamayo").into(LAST_NAME),
                Enter.theValue("test@test.com").into(EMAIL),
                Click.on(GENDER_MALE),
                Enter.theValue("3136697017").into(MOBILE_NUMBER),
                Scroll.to(DATE_OF_BIRTH),
                Click.on(DATE_OF_BIRTH),
                Wait.seconds(3),
                Click.on(YEAR)
        );
        for (int i = 0; i < 28; i++) {
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_UP).into(YEAR),
                    Hit.the(Keys.ENTER).into(YEAR)
            );
        }
        actor.attemptsTo(
                Click.on(MONTH)
        );
        for (int i = 0; i < 5; i++) {
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_UP).into(MONTH),
                    Hit.the(Keys.ENTER).into(MONTH)
            );
        }
        actor.attemptsTo(
                Click.on(DAY),
                Wait.seconds(2),
                Scroll.to(BUTTON_SUBMIT),
                Click.on(BUTTON_SUBMIT),
                Wait.seconds(2)
        );
    }
}
