package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/login.feature",glue={"Step"},
        plugin = {"json:target/cucumber.json"})


public class runner {
}
