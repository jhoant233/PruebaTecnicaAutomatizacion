package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenPage implements Task {
    private final String url;

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenPage.class);

    public OpenPage(String url) {
        this.url = url;
    }

    public static OpenPage url(String url) {
        return Tasks.instrumented(OpenPage.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
        LOGGER.info("Page loaded successfully");
    }
}
