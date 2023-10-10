package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLinks extends PageObject {
    public static final Target SIMPLE_LINK = Target
            .the("Simple link")
            .located(By.id("simpleLink"));
    public static final Target DYNAMIC_LINK = Target
            .the("Dynamic link")
            .located(By.id("dynamicLink"));
}
