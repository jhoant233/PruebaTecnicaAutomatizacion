package questions;

import com.ibm.icu.impl.Assert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.PageHome.BANNER_IMAGE;

public class VerifyRedirectLink implements Question<Boolean> {

    public static VerifyRedirectLink is() {
        return new VerifyRedirectLink();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        try {
            result = BANNER_IMAGE.isVisibleFor(actor);
        } catch (Exception e) {
            Assert.fail("It is not redirected to the page");
        }
        return result;
    }
}
