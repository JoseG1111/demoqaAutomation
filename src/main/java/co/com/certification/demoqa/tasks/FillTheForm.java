package co.com.certification.demoqa.tasks;

import co.com.certification.demoqa.models.FillTheFormModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.demoqa.userInterfaces.initialFormUI.*;
import static java.lang.System.getProperty;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTheForm implements Task {
private FillTheFormModel fillTheFormModel;

    public FillTheForm(FillTheFormModel fillTheFormModel) {
        this.fillTheFormModel = fillTheFormModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(fillTheFormModel.getFullName()).into(INPUT_NAME),
                Enter.theValue(fillTheFormModel.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(fillTheFormModel.getCurrentAddress()).into(INPUT_CURRENT_ADDRESS),
                Enter.theValue(fillTheFormModel.getPermanentAddress()).into(INPUT_PERMANENT_ADDRESS),
                Click.on(BTN_SUBMIT)
        );
    }

public static FillTheForm textBox(FillTheFormModel fillTheFormModel){return instrumented(FillTheForm.class, fillTheFormModel); }

}
