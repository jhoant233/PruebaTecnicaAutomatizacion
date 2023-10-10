package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHome extends PageObject {
    public static final Target FORM_SECTION = Target
            .the("Form section")
            .located(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2)"));

    public static final Target PRACTICE_FORM = Target
            .the("Practice Form")
            .located(By.xpath("//*[contains(text(),'Practice Form')]"));

    public static final Target ELEMENTS_SECTION = Target
            .the("Elements section")
            .located(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
    public static final Target BANNER_IMAGE = Target
            .the("Banner image")
            .located(By.xpath("//img[@class=\"banner-image\"]"));
    public static final Target LINKS = Target
            .the("links section")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));//TODO XPATH ABSOLUTO YA QUE GENERA CONFLICTO CON EL RELATIVO

    public static final Target WIDGETS_SECTION = Target
            .the("Widgets section")
            .located(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(4)"));
    public static final Target SLIDER = Target
            .the("Slider section")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]"));//TODO XPATH ABSOLUTO YA QUE GENERA CONFLICTO CON EL RELATIVO
}
