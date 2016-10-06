package niraamaya.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import niraamaya.utils.Properties;


public class LoginSteps extends BaseSteps {
    @Given("^I am on Loginpage$")
    public void iAmOnLoginpage() throws Throwable {

    }

    @When("^On Loginpage I enter login credentials as (\\w+)$")
    public void onLoginpageIEnterLoginCredentialsAsUser_type(String userType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^On Homepage I should receive a welcome message$")
    public void onHomepageIShouldReceiveAWelcomeMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
