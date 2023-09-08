package StepDefinitions;

import cucumber.api.java.en.*;
import pages.ArticlePage;
import org.junit.Assert;

public class Articles {

    @Then("^user should be able to view articles on home feed$")
    public void view_articles_home_feed() throws Throwable{
        int article_count = ArticlePage.article_list_size();
//        System.out.println(article_count);
        Assert.assertEquals(10,article_count);

    }

    @When("user clicks on favourite button")
    public void userClicksOnFavouriteButton() {
        
    }

    @Then("user should be able to view the article as favourited")
    public void userShouldBeAbleToViewTheArticleAsFavourited() {
        
    }

    @Then("user should see articles related to the tag")
    public void userShouldSeeArticlesRelatedToTheTag() {
    }
}
