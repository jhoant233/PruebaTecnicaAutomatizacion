package interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Wait implements Interaction {
    private final int secunds;

    public Wait(int secunds) {
        this.secunds = secunds;
    }


    @Override
    @Step("{0} wait #seconds second(s) before executing the next step")
    //Esta clase es de esperas Explicitas
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor((secunds * 1000));
    }
    public static Interaction seconds(int secunds) {
        return Tasks.instrumented(Wait.class, secunds);
    }

}