package co.com.certification.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.baseUrl")
        );
    }
    public static OpenThePage demoqaPage() {return instrumented(OpenThePage.class);}

}
