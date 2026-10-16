package co.com.certification.demoqa.stepDefinitions;

import co.com.certification.demoqa.models.FillTheFormModel;
import co.com.certification.demoqa.models.MessageModel;
import co.com.certification.demoqa.questions.MessageValidation;
import co.com.certification.demoqa.tasks.FillTheForm;
import co.com.certification.demoqa.tasks.OpenThePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.certification.demoqa.userInterfaces.initialFormUI.MESSAGE_VALIDATE;
import static co.com.certification.demoqa.utils.Constants.MESSAGE;

public class StepDefinitions {
    @Given("that the user access to the page demoqa")
    public void thatTheUserAccessToThePageDemoqa() {
        OnStage.theActorCalled("Jose").wasAbleTo(
                OpenThePage.demoqaPage()
        );

    }
    @When("the user fills the form")
    public void theUserFillsTheForm(FillTheFormModel fillTheFormModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillTheForm.textBox(fillTheFormModel)
        );

    }

    @Then("validates the message")
    public void validatesTheMessage(MessageModel messageModel) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        MessageValidation.messageValidation(messageModel, MESSAGE_VALIDATE)
                )


                );


    }
}
