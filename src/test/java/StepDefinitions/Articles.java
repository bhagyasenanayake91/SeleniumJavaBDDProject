package StepDefinitions;

import io.cucumber.java.en.*;
import pages.ArticlePage;
import org.junit.Assert;
import pages.HomePage;

public class Articles {

    @Then("user should be able to view articles on the home feed")
    public void view_articles_home_feed() throws Throwable{
        int article_count = ArticlePage.article_list_size();
        Assert.assertEquals(10,article_count);

    }

    @When("user clicks on favourite button")
    public void userClicksOnFavouriteButton() {
        
    }

    @Then("user should be able to view the article as favourited")
    public void userShouldBeAbleToViewTheArticleAsFavourited() {
        
    }

    @Then("user should see articles related to the tag")
    public void userShouldSeeArticlesRelatedToTheTag() throws Throwable{
        String tag_name= HomePage.get_home_feed_tag_name();
        Assert.assertEquals("welcome",tag_name);
    }

    @When("user clicks on an article")
    public void userClicksOnAnArticle() {
        
    }

    @Then("user should be able to view the article")
    public void userShouldBeAbleToViewTheArticle() {
        
    }

    @Then("user should view articles related to the tag")
    public void userShouldViewArticlesRelatedToTheTag() {
        
    }

    @When("user clicks add comment")
    public void userClicksAddComment() {
        
    }

    @Then("user should be able to view the added comment")
    public void userShouldBeAbleToViewTheAddedComment() {
    }

    @When("user clicks on a tag on the article page")
    public void userClicksOnATagOnTheArticlePage() {
    }
}
