package co.com.certification.demoqa.stepDefinitions;

import co.com.certification.demoqa.tasks.OpenThePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class StepDefinitions {
    @Given("that the user access to the page demoqa")
    public void thatTheUserAccessToThePageDemoqa() {
        OnStage.theActorCalled("Jose").wasAbleTo(
                OpenThePage.demoqaPage()
        );

    }
    @When("the user fills the form")
    public void theUserFillsTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillTheForm.textBox
        );

    }

    @Then("validates the message")
    public void validatesTheMessage() {

    }
}
