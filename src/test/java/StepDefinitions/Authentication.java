package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import pages.UserFeedPage;

public class Authentication {



    @Given("^user is logged in$")
    public void user_login() throws InterruptedException {
        HomePage.click_sign_in_link();
        SignInPage.login_with_valid_credentials();
    }

    @Then("user should be prompted to log in")
    public void userShouldBePromptedToLogIn() throws Throwable{
        String sign_up_heading_text = RegistrationPage.get_sign_up_page_heading_text();
        Assert.assertEquals("Sign up",sign_up_heading_text);
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() throws Throwable {
        SignInPage.login_with_valid_credentials();

    }

    @When("user enters invalid credentials")
    public void userEntersInvalidCredentials() throws Throwable{
        SignInPage.login_with_invalid_credentials();
    }

    @Then("user should not be able log in")
    public void userShouldNotBeAbleLogIn() throws Throwable{
        String error = SignInPage.get_invalid_login_error_message();
        Assert.assertEquals("email or password is invalid", error);
    }


}
