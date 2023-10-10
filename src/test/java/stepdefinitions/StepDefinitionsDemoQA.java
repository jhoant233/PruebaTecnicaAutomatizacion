package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.VerifyFormSubmission;
import questions.VerifyRedirectLink;
import questions.VerifySliderValue;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitionsDemoQA {
    private static final String ACTOR = "Johan";
    private Actor actor;
    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Before
    public void setStage() {
        actor = Actor.named(ACTOR);
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        actor = Actor.named(ACTOR);
        navegador.close();
    }

    @Given("that the Demo QA application is initiated")
    public void thatTheDemoQAApplicationIsInitiated() {
        actor.attemptsTo(OpenPage.url("https://demoqa.com/"));
    }

    @When("the form is completed and submitted")
    public void theFormIsCompletedAndSubmitted() {
        actor.attemptsTo(EnterFormData.theTest());
    }

    @Then("verify that a successful submission message is displayed")
    public void verifyThatASuccessfulSubmissionMessageIsDisplayed() {
        actor.should(seeThat(VerifyFormSubmission.is(), equalTo("Thanks for submitting the form")));
    }

    @When("enter the links elements section home")
    public void enterTheLinksElementsSectionHome() {
        actor.attemptsTo(EnterLinkHome.seccionElements());
    }

    @When("enter the links elements section homeMBMOp")
    public void enterTheLinksElementsSectionHomeMBMOp() {
        actor.attemptsTo(EnterLinkHomeMBMOp.seccionElements());
    }

    @Then("verify that the page loads and the content is visible")
    public void verifyThatThePageLoadsAndTheContentIsVisible() {
        actor.should(seeThat(VerifyRedirectLink.is(), equalTo(true)));
    }

    @When("enter the section widget and drag the slider")
    public void enterTheSectionWidgetAndDragTheSlider() {
        actor.attemptsTo(Slider.carousel());
    }

    @Then("verify the number shown")
    public void verifyTheNumberShown() {
        actor.should(seeThat(VerifySliderValue.is(), equalTo("3")));
    }
}
