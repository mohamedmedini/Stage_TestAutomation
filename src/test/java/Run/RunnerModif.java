package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		tags = "@Modifier_Salle", features = "src/test/features/Modification/ModifSalle.feature", glue = { "Hooks",
				"StepDefinition" },

		publish = true, plugin = { "pretty", "html:target/htmlreport.html", "json:target/report","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunnerModif {

}
