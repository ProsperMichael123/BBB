package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
    @Given("user on login page")
    public void userOnLoginPage() {
        System.out.println("userOnLoginPage");
    }

    @When("user enter username and password")
    public void userEnterUsernameAndPassword() {
        System.out.println("userEnterUsernameAndPassword");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton");
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }
}
