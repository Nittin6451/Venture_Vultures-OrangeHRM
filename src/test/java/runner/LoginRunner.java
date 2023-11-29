package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="@InvalidCredentials",features="C:\\Pilot_Project\\Venture_Vultures-OrangeHRM\\src\\test\\resources\\Features\\Login.feature",glue="com.StepDefinitonclass",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class LoginRunner {
 
}
 