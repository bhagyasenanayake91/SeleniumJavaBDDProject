package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pages.HomePage;
import utility.BrowserDriver;

public class Home {

    @Given("^user has navigated to the home page$")
    public void navigate_to_home_page() throws Throwable{
        HomePage.navigate_to_home_page();
    }

    @When("user views the home feed")
    public void userViewsTheHomeFeed() throws Throwable{
        HomePage.get_home_page_title();
    }

    @When("user clicks on a tag")
    public void userClicksOnATag() {
        
    }

    @When("user clicks a different page number")
    public void userClicksADifferentPageNumber() {
        
    }

    @Then("user should be navigated to that page number")
    public void userShouldBeNavigatedToThatPageNumber() {

    }
}
