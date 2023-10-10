package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeForm extends PageObject {
    public static final Target FIRST_NAME = Target
            .the("First name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target
            .the("Last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target
            .the("Email")
            .located(By.id("userEmail"));
    public static final Target GENDER_MALE = Target
            .the("Gender male")
            .located(By.cssSelector("label[for='gender-radio-1']"));
    public static final Target MOBILE_NUMBER = Target
            .the("Mobile number")
            .located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH = Target
            .the("Date of Birth")
            .located(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
    public static final Target BUTTON_SUBMIT = Target
            .the("Button Sumit")
            .located(By.id("submit"));
    public static final Target SUCCESSFUL_MESSAGE = Target
            .the("successful message form submission")
            .located(By.xpath("//*[@class=\"modal-title h4\"]"));

    public static final Target YEAR = Target
            .the("Year")
            .located(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select"));
    public static final Target MONTH = Target
            .the("Month")
            .located(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select"));

    public static final Target DAY = Target
            .the("Day")
            .located(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__month > div:nth-child(3) > div.react-datepicker__day.react-datepicker__day--019"));

}
