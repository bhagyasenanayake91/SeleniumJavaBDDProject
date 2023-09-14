package StepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.UserFeedPage;

public class Registration {
    @When("user enters the registration details")
    public void userEntersTheRegistrationDetails() throws Throwable{
        RegistrationPage.submit_registration_details();
    }
    @Then("user should be able to successfully register")
    public void userShouldBeAbleToSuccessfullyRegister() throws Throwable {
        String user_feed_link_text = UserFeedPage.get_user_feed_page();
        Assert.assertEquals("Your Feed",user_feed_link_text);
    }
}
