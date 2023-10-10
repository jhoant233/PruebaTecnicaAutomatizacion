package tasks;


import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.PageHome.*;
import static userinterface.PageLinks.*;

public class EnterLinkHome implements Task {
    public static Performable seccionElements() {
        return instrumented(EnterLinkHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ELEMENTS_SECTION),
                Click.on(ELEMENTS_SECTION),
                Scroll.to(LINKS),
                Click.on(LINKS),
                Click.on(SIMPLE_LINK),
                Wait.seconds(10),
                Switch.toNewWindow()
        );
        actor.attemptsTo(
                Switch.toNewWindow()
        );
    }
}
