package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.PracticeForm.*;


public class VerifyFormSubmission implements Question {

    public static VerifyFormSubmission is() {
        return new VerifyFormSubmission();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SUCCESSFUL_MESSAGE).answeredBy(actor);
    }
}
