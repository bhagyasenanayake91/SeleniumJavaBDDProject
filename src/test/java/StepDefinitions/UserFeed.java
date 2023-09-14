package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UserFeedPage;

public class UserFeed {
    @Then("user should get successfully logged in")
    public void userShouldGetSuccessfullyLoggedIn() throws Throwable{
        String user_feed_link_text = UserFeedPage.get_user_feed_page();
        Assert.assertEquals("Your Feed",user_feed_link_text);
    }

    @Given("user has navigated to Global feed page")
    public void userHasNavigatedToGlobalFeedPage() throws Throwable{
        UserFeedPage.click_global_feed_link();
    }
}
