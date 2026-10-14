package co.com.certification.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"co.com.certification.demoqa.stepDefinitions",
                "co.com.certification.demoqa.dataDefinitions"},
        snippets = CAMELCASE,
        plugin = {"pretty"}
)
public class Runner {
}
