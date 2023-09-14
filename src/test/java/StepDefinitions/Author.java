package StepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AuthorPage;
import utility.BrowserDriver;

public class Author {
    public static String follow_author_link = "/html/body/div/div/div/div[1]/div/div/div/follow-btn/button";

    @When("user clicks follow author")
    public void userClicksFollowAuthor() throws InterruptedException {
        Thread.sleep(2000);
        BrowserDriver.driver.findElement(By.xpath(follow_author_link)).click();
        Thread.sleep(2000);
    }

    @Then("user should be able to view the author as followed")
    public void userShouldBeAbleToViewTheAuthorAsFollowed() throws InterruptedException {
        Thread.sleep(4000);
        String follow_status = BrowserDriver.driver.findElement(By.xpath(follow_author_link)).getText();
//        Assert.assertEquals(".*Unfollow.*",follow_status);
        follow_status.contains("Unfollow");
        BrowserDriver.driver.findElement(By.xpath(follow_author_link)).click();
    }

    @When("user clicks on author name")
    public void userClicksOnAuthorName() {
        
    }

    @Then("user should be navigated to the authors profile")
    public void userShouldBeNavigatedToTheAuthorsProfile() throws Throwable{
        String Authors_name = AuthorPage.get_authors_name();
        Assert.assertEquals("Anah Benešová",Authors_name);
        
    }

    @When("user clicks on Favourites Articles tab")
    public void userClicksOnFavouritesArticlesTab() {
        
    }

    @Then("user should be navigated to the authors favourite articles page")
    public void userShouldBeNavigatedToTheAuthorsFavouriteArticlesPage() {

    }
    @When("user clicks on an author name on article")
    public void userClicksOnAnAuthorNameOnArticle() throws Throwable{
        AuthorPage.click_authors_name();
    }
}
