package StepDefinitions;

//import cucumber.api.PendingException;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;

public class Home {
    @Given("^user has navigated to the home page$")
    public void navigate_to_home_page() throws Throwable{
        HomePage.navigate_to_home_page();
    }

    @When("user views the home feed")
    public void userViewsTheHomeFeed() throws Throwable{
        HomePage.get_home_page_title();
    }

    @When("user clicks on a tag on home feed page")
    public void userClicksOnATag() throws Throwable{
        HomePage.click_home_feed_tag();
    }

    @When("user clicks a different page number")
    public void userClicksADifferentPageNumber() throws Throwable{
        HomePage.click_page_number();
        
    }

    @Then("user should be navigated to that page number")
    public void userShouldBeNavigatedToThatPageNumber() throws Throwable{
        int page_number = Integer.parseInt(HomePage.get_page_number());
        Assert.assertEquals(2, page_number);
    }

    @Given("user is not logged in")
    public void userIsNotLoggedIn() {
        
    }

    @Given("user has navigated to the registration page")
    public void userHasNavigatedToTheRegistrationPage() throws Throwable{
        HomePage.click_registration_link();
    }

    @Given("user has navigated to the log in page")
    public void userHasNavigatedToTheLogInPage() throws Throwable {
        HomePage.click_sign_in_link();

    }
}
