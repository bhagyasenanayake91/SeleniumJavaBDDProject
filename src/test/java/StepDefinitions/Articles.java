package StepDefinitions;

import io.cucumber.java.en.*;
import pages.ArticlePage;
import org.junit.Assert;
import pages.HomePage;
import pages.UserFeedPage;

public class Articles {

    @Then("user should be able to view articles on the home feed")
    public void view_articles_home_feed() throws Throwable{
        int article_count = ArticlePage.article_list_size();
        Assert.assertEquals(10,article_count);

    }

    @When("user clicks on favourite button")
    public void userClicksOnFavouriteButton() throws Throwable{
        UserFeedPage.click_favourite_button_link_home_feed();
    }

    @Then("user should be able to view the article as favourite")
    public void userShouldBeAbleToViewTheArticleAsFavourite() throws Throwable{
        UserFeedPage.click_favourite_button_link_home_feed();
    }

    @Then("user should see articles related to the tag")
    public void userShouldSeeArticlesRelatedToTheTag() throws Throwable{
        String tag_name= HomePage.get_home_feed_tag_name();
        Assert.assertEquals("welcome",tag_name);
    }

    @When("user clicks on an article")
    public void userClicksOnAnArticle() throws Throwable{
        HomePage.click_article_on_homepage();
    }

    @Then("user should be able to view the article")
    public void userShouldBeAbleToViewTheArticle() throws Throwable{
        String article_name = ArticlePage.get_article_title_name();
        Assert.assertEquals("Try to transmit the HTTP card, maybe it will override the multi-byte hard drive!", article_name);
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

    @When("user clicks on favourite button on article")
    public void userClicksOnFavouriteButtonOnArticle() throws Throwable{
        ArticlePage.click_favourite_article();
    }
}
